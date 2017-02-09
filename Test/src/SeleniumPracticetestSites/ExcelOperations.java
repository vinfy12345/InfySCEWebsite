package SeleniumPracticetestSites;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelOperations {

	int NoOfCols, NoOfRows;
	public String filelocation = "C:\\Users\\Veena_Mathew\\workspace\\Test\\src\\TestData\\LoginCreds.XLS";
	public  FileInputStream ipstr = null;
	public  FileOutputStream opstr =null;
	private HSSFWorkbook wb = null;
	private HSSFSheet ws = null;	
	
	
	public ExcelOperations()
	{
		try
		{
			System.out.println("Inside Excel Operations Constructor");
			ipstr = new FileInputStream(filelocation);
			wb = new HSSFWorkbook(ipstr);
			ws = wb.getSheetAt(0);
			ipstr.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public int NoofRowsCalc()
	{
		int sheetIndex=wb.getSheetIndex(ws);
		if(sheetIndex==-1)
			return 0;
		else{
			ws = wb.getSheetAt(sheetIndex);
			int rowCount=ws.getLastRowNum()+1;		
			return rowCount;		
		}
	}
	
	public int NoofColsCalc()
	{
		int sheetIndex=wb.getSheetIndex(ws);
		if(sheetIndex==-1)
			return 0;
		else{
			ws = wb.getSheetAt(sheetIndex);
			int colCount=ws.getRow(0).getLastCellNum();			
			return colCount;
		}
	}
	
}
