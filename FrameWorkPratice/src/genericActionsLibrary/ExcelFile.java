package genericActionsLibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class ExcelFile {
	static String filePath = "./TestData/TestData.xlsx";
	static String testData;

	@SuppressWarnings("deprecation")
	public static String readExcel(int sheetNum, int rowNum, int cellNum)
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheetAt(sheetNum);
			Row row = sheet.getRow(rowNum);
			row.getCell(cellNum).setCellType(XSSFCell.CELL_TYPE_STRING);
			testData = row.getCell(cellNum).getStringCellValue().toString();
			wb.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testData;
		
	}
	
	public static void writeExcel(int sheetNum, int rowNum, int cellNum, String resultData)
	{
		try
		{
			FileInputStream fis=new FileInputStream(filePath);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheetAt(sheetNum);
			Row row=sh.getRow(rowNum);
			Cell cell = row.createCell(cellNum);
			FileOutputStream fos = new FileOutputStream(filePath);
			cell.setCellValue(resultData);
			wb.write(fos);
			wb.close();
		}
		catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
