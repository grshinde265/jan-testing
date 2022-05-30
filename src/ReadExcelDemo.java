import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelDemo {

	@Test
	public void ReadExcel() throws IOException
	{
		FileInputStream excelfile = new FileInputStream("C:\\Users\\Sharayu\\Dropbox\\My PC (LAPTOP-IKS9SD1L)\\Desktop\\jan22.xlsx");
		
		XSSFWorkbook wbook = new XSSFWorkbook(excelfile);
		
		XSSFSheet s1 = wbook.getSheet("Sheet1");
		
		System.out.println(s1.getRow(0).getCell(0).getStringCellValue());
		System.out.println(s1.getRow(0).getCell(1).getStringCellValue());
		
		
		XSSFSheet s2 = wbook.getSheet("Sheet2");
		
	
		
		System.out.println(s2.getRow(2).getCell(0).getStringCellValue());
		System.out.println(s2.getRow(2).getCell(1).getNumericCellValue());
	}
}

