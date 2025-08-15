/*import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ecxl {

    private static String excelFilePath = "testdata.xlsx";
    private static Workbook workbook;
    private static Sheet sheet;

    // Load Excel file
    public static void loadExcel(String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(excelFilePath);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheet(sheetName);
        fis.close();
    }

    // Read data from a cell
    public static String getCellData(int rowNum, int colNum) {
        Row row = sheet.getRow(rowNum);
        Cell cell = row.getCell(colNum);
        return cell.toString();  // handles string, number, etc.
    }

    // Write data to a cell
    public static void setCellData(int rowNum, int colNum, String value) throws IOException {
        Row row = sheet.getRow(rowNum);
        if (row == null)
            row = sheet.createRow(rowNum);

        Cell cell = row.getCell(colNum);
        if (cell == null)
            cell = row.createCell(colNum);

        cell.setCellValue(value);

        FileOutputStream fos = new FileOutputStream(excelFilePath);
        workbook.write(fos);
        fos.close();
    }

    // Close workbook
    public static void closeWorkbook() throws IOException {
        workbook.close();
    }

    // Sample usage
    public static void main(String[] args) throws IOException {
        loadExcel("Sheet1");

        // Read data
        String username = getCellData(0, 0);
        System.out.println("Username from Excel: " + username);

        // Write data
        setCellData(1, 1, "Test Passed");

        closeWorkbook();
    }
}*/
