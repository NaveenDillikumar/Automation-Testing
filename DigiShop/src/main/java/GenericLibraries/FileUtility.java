package GenericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	
	public static String ReadCellData(String sheetName,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
		
		//Workbook book = WorkbookFactory.create(fis);
		
		//Sheet sheet = book.getSheet(sheetName);
		
		//Row row = sheet.getRow(rownum);
		
		//Cell cell = row.getCell(cellnum);
		
		//String name = cell.getStringCellValue();
		
		//double Phone=cell.getNumericCellValue();
		
		//System.out.println(name);
		//return name;
		
		return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
	}
	
	public static String[][]getExceldata(String sheetname){
		
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("./src/test/resources/testdata.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			Workbook workbook=null;
			
			try {
				workbook=WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
				Sheet sheet=workbook.getSheet(sheetname);
				
				int rowcount = sheet.getPhysicalNumberOfRows();
				
				int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
				
				System.out.println(rowcount);
				System.out.println(cellcount);
				
				String[][] data=new String[rowcount-1][cellcount];
				
				for(int i=0;i<rowcount;i++) {
					for(int j=0;j<cellcount;j++) {
						data[i-1][j]=sheet.getRow(i).getCell(j).toString();
						
					}
				}
				
				return data;
				
				
			}
		}
		return null;
	}
}
