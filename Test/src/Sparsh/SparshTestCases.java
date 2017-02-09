package Sparsh;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;





public class SparshTestCases extends SuiteBase {
	Read_XLS FilePath = null;	
	String TestCaseName = null;
	



@Test
public void setup() throws IOException{
	//Called init() function from SuiteBase class to Initialize .xls Files
	init();	
	FilePath = XpathExcelPath;
	System.out.println("FilePath Is : "+FilePath);
	TestCaseName = this.getClass().getSimpleName();	
	System.out.println("TestCaseName Is : "+TestCaseName);
}

@Test
public Object[][] SuiteOneCaseOneData(){
	
	return SuiteUtility.GetTestDataUtility(FilePath, TestCaseName);
}

@Test
public void openBrowser() throws IOException
{
	
}


	

}
