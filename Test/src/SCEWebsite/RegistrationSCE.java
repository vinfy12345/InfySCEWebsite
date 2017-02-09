package SCEWebsite;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class RegistrationSCE extends SuiteBaseSCE {
	
	String TestCaseName = null;
	String Status=new String("Pass"),timestamp, ssname;
	public Object[][] dataFromExcel;
	int i=0,j=0;
	CommonMethods tmsp =new CommonMethods();
	WebElement check;

	
	@BeforeClass
	public static void openBrowser() throws IOException{
		//Called init() function from SuiteBase class to Initialize .xls Files
		init();	
		logger.info("Browser Opened");
	}

	@AfterClass
	public static void closeBrowser() throws Exception {
		driver.close();
	}

	@Test
	public void RegisterFirstpageConfirmPwdMismatch() throws IOException {
		logger.info("Inside RegisterFirstpageConfirmPwdMismatch()");
		init_Registration();
		TestCaseName=new Object(){}.getClass().getEnclosingMethod().getName();
		dataFromExcel=FilePath.retrieveTestData("Sheet1");
			/*Below reads from excel and types into the webpage . When using testNG, the below can be performed without loop 
			using Data Provider and @Test*/
		logger.info("starting loop to read from excel");
			for(i=0;i<=1;i++)
			{
				
				driver.findElement(By.xpath(prop.getProperty("Email"))).sendKeys(dataFromExcel[i][0].toString());
				driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(dataFromExcel[i][1].toString());
				driver.findElement(By.xpath(prop.getProperty("confirmPassword"))).sendKeys(dataFromExcel[i][2].toString());
				try
				{
					driver.findElement(By.xpath(prop.getProperty("NextButton"))).click();	
					check=driver.findElement(By.xpath(prop.getProperty("confrmPwdErrMsg")));
					String errormsg="Your passwords must match";
				if(check.isDisplayed())
				{
					logger.info("The passwords dont match , Hence test Case is passed");
					Status="Passed";
				}
				}
				catch(NoSuchElementException a)
				{
					logger.info("The passwords are match , hence Test Case is failed");
					Status="Failed";
				}
				catch(Exception a)
				{
					System.out.println("inside catch");
					Status="Failed";
				}
				
				finally 
				{
					ssname=tmsp.ScreenShotCapture(TestCaseName);
					Object data[] = new Object[]{TestCaseName,Status,tmsp.TimeStampCalc(),ssname};	
					FilePathOutputSheet.WriteintoTestExecutionSheet("Sheet1",data);
					driver.navigate().refresh();
				}
			}
				
			logger.info("Leaving the RegisterFirstpageConfirmPwdMismatch" );
	}
	
	//@Test
	//public void RegisterProcessComplete()
	//{
	//	logger.info("Inside RegisterProcessComplete Test case.()");
	//	init_Registration();
		
	//}
}

