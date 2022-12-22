package filereading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteExcelDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 //obtaining input bytes from a file  
	    FileInputStream fis = new FileInputStream(new File("C:\\personal\\Java\\files\\employee.xlsx"));
	    //creating workbook instance that refers to .xls file  
	    HSSFWorkbook wb = new HSSFWorkbook(fis);
	    //creating a Sheet object to retrieve the object  
	    HSSFSheet sheet = wb.getSheetAt(0);
	    
	    System.out.println(sheet.getDialog());
	    
	   
		}

}
