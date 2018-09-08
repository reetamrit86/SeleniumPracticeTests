package EXCELDataRetrieval;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DATAFromEXCEL {

	public static void main(String[] args) throws IOException    {
		// TODO Auto-generated method stub

	
		FileInputStream fis=new FileInputStream("C:\\Users\\SUKHMANI\\Desktop\\DATA.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
	    XSSFSheet sheet=wb.getSheet("record");
	    XSSFRow row=sheet.getRow(1);
	    XSSFCell cell=row.getCell(2);
	    String value=cell.getStringCellValue();
	    System.out.println(value);
		
	
	
	
	
	}

}
