package SCEWebsite;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;


public class SuiteBaseSCE {
	public  static Logger logger=Logger.getLogger(RegistrationSCE.class);
	public static ExcelOpsESCE RegisterCfmPwd =null;
	public static ExcelOpsESCE TestExecutionSheet=null;
	public static WebDriver driver;
	public static String url="https://wwwsysb.sce.com/";
	public static Properties prop = new Properties();
	public static InputStream input = null;
	
	public static ExcelOpsESCE FilePath = null;
	public static ExcelOpsESCE FilePathOutputSheet=null;
	//public Properties prop = new Properties();
	
	public static void init() throws IOException{
		System.out.println("Inside Init()");
		driver=new FirefoxDriver();
		//Initializing RegistrationConfirmPwd TestData  File Path Using Constructor Of ExcelOpsSCE Utility Class.
		//RegisterCfmPwd = new ExcelOpsESCE(System.getProperty("user.dir")+"\\src\\TestDataSCE\\RegisterFirstpageConfirmPwdMismatch.XLS");
		TestExecutionSheet=new ExcelOpsESCE(System.getProperty("user.dir")+"\\src\\TestDataSCE\\TestCaseExecutionSheet.XLS");
		FilePathOutputSheet = TestExecutionSheet;
		input = new FileInputStream(System.getProperty("user.dir")+"\\src\\TestDataSCE\\XpathConfig.properties");
		prop.load(input);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
		 System.out.println("Leaving Init()");
		 
		 
		
}
	public static void init_Registration() {
		RegisterCfmPwd = new ExcelOpsESCE(System.getProperty("user.dir")+"\\src\\TestDataSCE\\RegisterFirstpageConfirmPwdMismatch.XLS");
		FilePath = RegisterCfmPwd;
		driver.findElement(By.xpath(prop.getProperty("Register"))).click();
		
	}
	
}
