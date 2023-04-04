package GenericLaibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class contatins reusable methods with respect to excel
 * @param sheetName
 * @param cellNum
 * @return
 */
public class ExcelUtility
{
	private Workbook wb;
	/**
	 * This method is used to intialize excel file
	 * @param excelPath
	 */
	public void excelIntialization(String excelPath) 
	{
		FileInputStream fis= null;
		try {
			fis = new FileInputStream(excelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try 
		{
			wb =  WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException |   IOException e) {
			e.printStackTrace();
		}  
	}
		/**
		 * This method is used to read single data from excel
		 * @param sheetName
		 * @param cellNum
		 * @return
		 */
		public String readData(String sheetName,int rowNum,int cellNum)
		{
			
			return wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		}
	
	public Map<String,String> readData(String sheetName) {
		Map<String,String> map = new HashMap<>();
		Sheet sh = wb.getSheet(sheetName);
		for(int i =0; i<=sh.getLastRowNum(); i++)
		{
			Cell cell0 = sh.getRow(i).getCell(0);
			Cell cell1 = sh.getRow(i).getCell(1);
			String key = cell0.getStringCellValue();
			String valve = cell1.getStringCellValue();
			map.put(key,valve);
		}
			return map;
	}
	/**
	 * This method is used to close the workbook
	 */
		public void closeWorkbook() {
			try {
				wb.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
}
