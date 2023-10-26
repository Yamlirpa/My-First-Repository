package read_excel_file;

 

import java.io.FileInputStream;
import java.io.IOException;

 

import org.testng.annotations.Test;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

 //test

public class Excel_simple_reading {

 

	//@Test
	public void readExcelFile() throws IOException {

 

		String path = "C:\\Users\\Administrator\\Desktop\\Testing.xls";
		FileInputStream fis = new FileInputStream(path);
		Workbook workbook = new HSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("April");

 

		// System.out.println(sheet.getRow(2).getCell(3));

 

		int lastRow = sheet.getLastRowNum();
		System.out.println("Last row- " + lastRow);
		for (int i = 0; i <= lastRow; i++) {
			Row row = sheet.getRow(i);
			int lastCell = row.getLastCellNum();
			for (int j = 0; j < lastCell; j++) {
				Cell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
			System.out.println();
		}

 

		/*
		 * for (int i = 0; i <= sheet.getLastRowNum(); i++) { Row row = sheet.getRow(i);
		 * for (int j = 0; j < row.getLastCellNum(); j++) {
		 * System.out.println(row.getCell(j).getStringCellValue()); }
		 * System.out.println(); }
		 */

 

	}

 

	@Test
	public void readXLS() {
		readXLs("Smoke_3","Email");

	}



	public static void readXLs(String testName, String columnName) {

 

		try {
			String path = "C:\\Users\\Administrator\\Desktop\\Testing.xls";
			FileInputStream fis = new FileInputStream(path);
			Workbook workbook = new HSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet("April");
			int lastRow = sheet.getLastRowNum();
			System.out.println("Last row- " + lastRow);
			for (int i = 0; i <= lastRow; i++) {
				Row row = sheet.getRow(i);
				int lastCell = row.getLastCellNum();
				Cell cell = row.getCell(0);
				String value = cell.getStringCellValue();
				// System.out.println(value);
				if (value.equals(testName)) {
					Row rownew = sheet.getRow(0);
					for (int j = 0; j < lastCell; j++) {
						Cell cellnew = rownew.getCell(j);
						String valuenew = cell.getStringCellValue();
						if (cellnew.toString().equals(columnName)) {

 

							System.out.println(sheet.getRow(i).getCell(j));

 

						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

 

}