package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
		screenShot = new ScreenShot(driver); 
		// open the browser 
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() {
		loginPOM.sendUserName("administrator");
		loginPOM.sendPassword("administrator@123");
		loginPOM.clickLoginBtn(); 
//		actions.moveToElement(target).perform()
		driver.findElement(By.xpath("//*[@class='avatar avatar-26 photo']")).click();
		driver.findElement(By.id("first_name")).clear();
		driver.findElement(By.id("first_name")).sendKeys("manzoor");
		driver.findElement(By.id("phone")).clear();
		driver.findElement(By.id("phone")).sendKeys("9876543210");
		driver.findElement(By.id("submit")).click();
		//driver.findElement(By.cssSelector("class='avatar avatar-26 photo'")).click();	
		screenShot.captureScreenShot("First");
	}
}
