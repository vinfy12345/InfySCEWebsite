package webdriver_Junit;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindActiveElement;

public class LoginCheckTest {
	private static FirefoxDriver driver;
	WebElement element,el;
 	
	@BeforeClass
	public static void openBrowser() throws Exception {
	         driver = new FirefoxDriver();
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			} 
	

	@Test
	public void ValidUserLogin() {
		// System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
		 System.out.println("The method which is starting to test  : "+ Thread.currentThread().getStackTrace()[1].getMethodName());
		 driver.get("https://www.flipkart.com/");	
		// driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		 driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[9]/a")).click();
		 driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("veenamathew1234@gmail.com");
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Welcome123rt");
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		
		try
		{
			
			element=driver.findElement(By.className("_2k0gmP"));
			element.click();
			
			
		}
		catch (Exception e)
		{
		
		}
		assertNotNull(element);
		
		System.out.println("Ending test "+new Object(){}.getClass().getEnclosingMethod().getName());
		
	
	}
	/*@Test
	public void InValidUserLogin()
	{
		System.out.println("The method which is starting to test  : "+ Thread.currentThread().getStackTrace()[1].getMethodName());
		 driver.get("https://www.flipkart.com/");	
		// driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		 driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[9]/a")).click();
		 driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("veenamathew234@gmail.com");
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Welcome123rt");
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		try
		{
			element=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[8]/ul/li[10]/a"));
		}
		catch (Exception e)
		{
			
		}
		 assertNotNull(element);
	     System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
	*/
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.close();
	}

	

}
