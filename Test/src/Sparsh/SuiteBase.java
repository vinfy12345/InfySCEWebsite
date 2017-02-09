package Sparsh;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SuiteBase {

	public static Read_XLS XpathExcelPath=null;
	public  static WebDriver driver;
	
	public void init() throws IOException{
		 //driver=new FirefoxDriver();
		//Initializing Xpath Data (XpathData.xls) File Path Using Constructor Of Read_XLS Utility Class.
		XpathExcelPath = new Read_XLS(System.getProperty("user.dir")+"\\src\\TestData\\SparshTestCases.XLS");
		//System.out.println("XPath location  in init()" + XpathExcelPath);
}
}
