package webdriver_Junit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
	public static void setExcelfile(String Path,String SheetName) throws Exception
	{
		// THis method helps to set the excel file and the path
		
		FileInputStream ExcelFile=new FileInputStream(Path);
		ExcelWBook=new XSSFWorkbook(ExcelFile);
		ExcelWSheet=ExcelWBook.getSheet(SheetName);
		
	}
	
	public static int readExcelFile(int Rownum,int Colnum)
	{
		Cell=ExcelWSheet.getRow(Rownum).getCell(Colnum);
		//String CellData=Cell.getStringCellValue();
		DataFormatter formatter = new DataFormatter();
		String CellData=formatter.formatCellValue(Cell);
		int num= Integer.parseInt(CellData);
		return num;//(CellData));
	}
	
	public static void writetoExcel(String result,int RowNum,int ColNum) throws Exception
	{
		try
		{
		//Cell= ExcelWSheet.getRow(RowNum).getCell(ColNum);
		//Cell.setCellValue(result);
			Row  = ExcelWSheet.getRow(RowNum);
			Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
			if (Cell == null) {

				Cell = Row.createCell(ColNum);
				Cell.setCellValue(result);

				} 
			else {
						Cell.setCellValue(result);

				}
		// Accessing Test Data path and test data file.
		FileOutputStream file=new FileOutputStream(ConstantDataDrivenTest.Path_TestData+ConstantDataDrivenTest.File_TestData);
		ExcelWBook.write(file);
		}
		
		catch (Exception e)
		{
			throw(e);
		}
	}
	
	
}
