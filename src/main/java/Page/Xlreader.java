package Page;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlreader {
	public String path;
	public FileInputStream fis = null;
	private static XSSFWorkbook workbook = null;
	private static XSSFSheet sheet = null;
	private static XSSFRow row = null;
	private static XSSFCell cell = null;

	// Constructor to initialize variables
	//XSSF is used 2010 or later version
	//	HSSF for 2007 and earlier
	public void ExcelReader(String path) {
	this.path = path;
	try {
	fis = new FileInputStream(path);
	workbook = new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(0);
	fis.close();
	} catch (Exception e) {
	e.printStackTrace();
	}
	}

	// Method to call the value
	public static String getCellData(String sheetName, String colName, int rowNum) {
	// For Sheet
	int index = workbook.getSheetIndex(sheetName);
	int col_Num = 0;
	sheet = workbook.getSheetAt(index);

	// For Row
	row = sheet.getRow(0);
	for (int i = 0; i < row.getLastCellNum(); i++) {
	if (row.getCell(i).getStringCellValue().trim().equals(colName.trim())) {
	col_Num = i;
	}
	}

	// For Column
	row = sheet.getRow(rowNum - 1);
	cell = row.getCell(col_Num);
	return cell.getStringCellValue();


}
}