package EXCELDataRetrieval;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DATAToEXCEL {

		 XSSFWorkbook wb=null;
	     XSSFSheet sheet=null;
	     XSSFRow row=null;
	     XSSFCell cell;
		
		
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

        retrieve(4,4);
		  
		   
		
		}
	    static String retrieve(int rownum,int cellnum) throws IOException
	    {
	    	FileInputStream file=new FileInputStream("C:\\Users\\SUKHMANI\\Desktop\\DATA.xlsx");
	        XSSFWorkbook wb=new XSSFWorkbook(file);
	        XSSFSheet sheet=wb.getSheet("record");
	        XSSFRow row=sheet.getRow(rownum);
	        XSSFCell cell=row.getCell(cellnum);
	        
	    }


	
	}
