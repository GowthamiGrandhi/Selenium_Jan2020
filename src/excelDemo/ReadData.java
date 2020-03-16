package excelDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	public static int getRowCount() {
		int n=0;
		try {
			File f1 = new File("C:\\Users\\Grandhi_Leela\\Desktop\\yoga contacts.xlsx");
			FileInputStream inpstr = new FileInputStream(f1);
			XSSFWorkbook wb1 = new XSSFWorkbook(inpstr);	
			
			XSSFSheet ws1 = wb1.getSheet("Sheet1");
			n = ws1.getLastRowNum();
		}
		catch(Exception e) {
			
		}
			return n;
	}
//============================================================================================
	public static String getCellData(int r, int c) {
		String cellval = null;
		try {
			File f1 = new File("C:\\Users\\Grandhi_Leela\\Desktop\\yoga contacts.xlsx");
			FileInputStream inpstr = new FileInputStream(f1);
			XSSFWorkbook wb1 = new XSSFWorkbook(inpstr);
			
			XSSFSheet ws1 = wb1.getSheet("Sheet1");
			cellval = ws1.getRow(r).getCell(c).getStringCellValue();
		}
		catch(Exception e) {
			
		}
		return cellval;
	}
//================================================================================================
	public static String[] getRowData(String TCName) {
		String[] arr = new String[2];
		try {
			File f1 = new File("C:\\Users\\Grandhi_Leela\\Desktop\\yoga contacts.xlsx");
			FileInputStream inpstr = new FileInputStream(f1);
			XSSFWorkbook wb1 = new XSSFWorkbook(inpstr);
			
			XSSFSheet ws1 = wb1.getSheet("Sheet1");
			int n = ws1.getLastRowNum();
			for(int i=1; i<=n; i++) {
				String Excel_TCName = ws1.getRow(i).getCell(1).getStringCellValue();
				if(Excel_TCName.trim().equals(TCName)) {
					arr[0] = ws1.getRow(i).getCell(2).getStringCellValue();
					arr[1] = ws1.getRow(i).getCell(3).getStringCellValue();
				}
			}
		}
		catch(Exception e) {
		}
		return arr;
	}
//=====================================================================================
	public static void main(String[] args) throws IOException {
		
				int rCount = getRowCount();
				System.out.println(rCount);
				
				String cellvalue = getCellData(1,1);
				System.out.println(cellvalue);
				
				String[] data = getRowData("TC01_CancelledLeave");
				System.out.println("User id is: " +data[0]+ " and password is: " + data[1]);
		
	}
}