package WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BasicExcelPractice {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
	FileInputStream file;
//		file = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Desktop\\MyExcel.xlsx");
//		String username = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		System.out.println(username);
//
//		file = new FileInputStream("C:\\Users\\DELL\\Desktop\\Automation_Test.xlsx");
//		String password = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
//		System.out.println(password);

		ArrayList al = new ArrayList();
	
	
		for (int i=0; i<=9;i++) {
			 file = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Desktop\\MyExcel.xlsx");
			String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			System.out.println(data);
			al.add(data);
		}
		System.out.println("the size of arrylist is "+ al.size());

}
}
