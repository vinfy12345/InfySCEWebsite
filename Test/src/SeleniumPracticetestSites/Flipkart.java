package SeleniumPracticetestSites;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {
	public static WebDriver driver=new FirefoxDriver();
	public ExcelOperations exl=new ExcelOperations();

	@BeforeClass
	public static void openBrowser() throws Exception {
		System.out.println("entering @Before Class");
		driver.get("https://www.flipkart.com/");
		System.out.println("exiting @Before Class");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void LoginCheck() {
		System.out.println("entering @Test- loginCheck()");
		driver.findElement(By.xpath("//div[contains(@id,'container')]/div//header[contains(@class,'CGBNf7')]//div[contains(@class,'AsXM8z') and contains(@data-reactid,'11')]/ul//li[contains(@class,'_2sYLhZ') and contains(@data-reactid,'33')]/a")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[contains(@class,'_1XBjg- row')]//div[contains(@class,'Km0IJL col col-3-5')]/div/form/div/input[contains(@class,'_2zrpKA') and contains(@type,'text')]")).sendKeys("veenamathew1234@gmail.com");
		driver.findElement(By.xpath("//div[contains(@class,'_1XBjg- row')]//div[contains(@class,'Km0IJL col col-3-5')]/div/form/div/input[contains(@class,'_2zrpKA') and contains(@type,'text')]")).sendKeys("veenamathew1234@gmail.com");
		driver.findElement(By.xpath("//div[contains(@class,'_1XBjg- row')]//div[contains(@class,'Km0IJL col col-3-5')]/div/form/div/input[contains(@class,'_2zrpKA') and contains(@type,'password')]")).sendKeys("Welcome123rt");
		driver.findElement(By.xpath("//div[contains(@class,'_1XBjg- row')]//div[contains(@class,'Km0IJL col col-3-5')]/div/form//div[contains(@class,'_1avdGP')]/button")).click();
		System.out.println("The number of rows="+ exl.NoofRowsCalc());
		System.out.println("The number of columns="+ exl.NoofColsCalc());
		
		
	}

}
