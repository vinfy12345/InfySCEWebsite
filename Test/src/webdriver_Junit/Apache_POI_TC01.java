package webdriver_Junit;

import webdriver_Junit.ConstantDataDrivenTest;
import webdriver_Junit.ExcelUtils;
public class  Apache_POI_TC01 {

	public static void main(String[] args) {
		
		int num1,num2, sum=0;
		String result;
		// Reading from the file.
		try {
			ExcelUtils.setExcelfile(ConstantDataDrivenTest.Path_TestData+ConstantDataDrivenTest.File_TestData, "Sheet1");
			num1=ExcelUtils.readExcelFile(1, 1);
			num2=ExcelUtils.readExcelFile(1, 2);
			sum=num1+num2;
			System.out.println("The result is :"+ sum);
			result=Integer.toString(sum);
			ExcelUtils.writetoExcel(result, 1, 3);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
