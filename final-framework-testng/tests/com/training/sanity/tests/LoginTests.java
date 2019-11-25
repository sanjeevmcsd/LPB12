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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;

public class LoginTests 
{
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	

	@BeforeClass
	public static void setUpBeforeClass() throws IOException 
	{
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception 
	{
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
		screenShot = new ScreenShot(driver); 
		// open the browser 
		
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception 
	{
		Thread.sleep(1000);
	driver.quit();
	}
	@Test
/*	public void validLoginTest() throws InterruptedException 
	{
		String str;
		loginPOM.sendUserName("administrator");
		loginPOM.sendPassword("Sanjusanju@321");
		loginPOM.clickLoginBtn(); 
	//	actions.moveToElement(target).perform();
	driver.findElement(By.xpath("//*[@class='avatar avatar-26 photo']")).click();
		driver.findElement(By.id("first_name")).clear();
		driver.findElement(By.id("first_name")).sendKeys("manzoor");
		driver.findElement(By.id("phone")).clear();
		driver.findElement(By.id("phone")).sendKeys("9876543210");
		System.out.println(driver.findElement(By.xpath("//*[@class='button wp-generate-pw hide-if-no-js']")).getText());
		
		driver.findElement(By.xpath("//*[@class='button wp-generate-pw hide-if-no-js']")).click();
		
		driver.findElement(By.xpath("//*[@id='pass1-text']")).clear();
		driver.findElement(By.xpath("//*[@id='pass1-text']")).sendKeys("Sanjusanju@321");
		//driver.wait();
		
		//str = driver.findElement(By.xpath("//*[@class='strong']")).getText();
		str = driver.findElement(By.xpath("//*[@aria-live = 'polite']")).getText();
		System.out.println(str);
	if (str.contains("Strong"))
		{
		System.out.println("Clicking on button");
			driver.findElement(By.id("submit")).click();
			driver.findElement(By.xpath("//*[@class='avatar avatar-26 photo']")).click();
			System.out.println("Now clicking on log out button now");
			//driver.findElement(By.xpath("//*[contains(text(),'http://realestatem1.upskills.in/wp-login.php?action=logout') and @class='ab-item'] ")).click();
			//*[starts-with(@href,'http://realestatem1.upskills.in/wp-login.php?action=logout')]
		////*[starts-with(@href,'value')]
			//driver.findElement(By.xpath("//li[@id='wp-admin-bar-logout']/a")).click();
			
			
			driver.findElement(By.xpath("//a[contains(@href,'http://realestatem1.upskills.in/wp-login.php?action=logout']")).click();
		}
		else
		{
			System.out.println("password is not strong");
		}
			
		//driver.findElement(By.cssSelector("class='avatar avatar-26 photo'")).click();	
		screenShot.captureScreenShot("First");
	} */
	
/*	public void MediamTestCase()
	{
		/*loginPOM.sendUserName("administrator");
		loginPOM.sendPassword("Sanjusanju@321");
		loginPOM.clickLoginBtn(); 
		driver.findElement(By.xpath("//*[@id='menu-item-513']")).click();
		driver.findElement(By.id("keyword_search")).clear();
		driver.findElement(By.id("keyword_search")).sendKeys("Nullam hendrerit apartment");
		//driver.findElement(By.xpath("//*[@class='col-md-12']/button")).click();
		driver.findElement(By.xpath("//*[@class='row with-forms']/div/button")).click();
		System.out.println("Click on search button");
	//	driver.findElement(By.name("button fullwidth")).click();
		driver.findElement(By.xpath("//*[@class='button fullwidth margin-top-20']")).click();
		driver.findElement(By.name("name")).sendKeys("Sanjeev KUmar");
		driver.findElement(By.name("email")).sendKeys("skumar34@in.ibm.com");
		driver.findElement(By.name("subject")).sendKeys("Appartments");
		driver.findElement(By.name("id:comments")).clear();	
		driver.findElement(By.name("id:comments")).sendKeys("looking for apartment");
		driver.findElement(By.xpath("//*[@class='wpcf7-form-control wpcf7-submit' and @type = 'submit']")).click();
		
	}  */
	
//	@Test
	public void MediunTestCAse2()
	{
		
			loginPOM.sendUserName("administrator");
			loginPOM.sendPassword("Sanjusanju@321");
			loginPOM.clickLoginBtn(); 
			driver.findElement(By.linkText("Users")).click();
			driver.findElement(By.linkText("Add New")).click();
			driver.findElement(By.name("user_login")).click();
			driver.findElement(By.name("user_login")).clear();
			driver.findElement(By.name("user_login")).sendKeys("SamKumar");
			driver.findElement(By.name("email")).click();
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys("skumar343@in.ibm.com");			driver.findElement(By.name("user_login")).sendKeys("SamKumar");
			driver.findElement(By.name("first_name")).click();
			driver.findElement(By.name("first_name")).clear();
			driver.findElement(By.name("first_name")).sendKeys("Sanjeev");
			driver.findElement(By.name("last_name")).click();
			driver.findElement(By.name("last_name")).clear();
			driver.findElement(By.name("last_name")).sendKeys("Kumar");
			driver.findElement(By.name("url")).click();
			driver.findElement(By.name("url")).clear();
			driver.findElement(By.name("url")).sendKeys("sanjeev.com");
			driver.findElement(By.xpath("//*[@type='button' and contains(text(),'Show password')]")).click();
		//	
			driver.findElement(By.xpath("//*[@name='pass1-text']")).clear();
			driver.findElement(By.xpath("//*[@name='pass1-text']")).sendKeys("Manzoor@Mehadi123");
			driver.findElement(By.name("role")).click();
			Select roles = new Select(driver.findElement(By.name("role")));
				roles.selectByVisibleText("Agent");
				driver.findElement(By.id("createusersub")).click();
				
				
				
			
			
	}
	
	
	
	
	
	
	
}
