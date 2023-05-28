package learn_advanced.fileIO;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import static org.apache.poi.ss.usermodel.CellType.STRING;


public class LearnExcelIO {

    public static void main(String[] args) throws IOException {
        String projectPath = System.getProperty("user.dir");
        String filepath = projectPath + File.separator + "ext_files" + File.separator +"student_list.xlsx";

        FileInputStream fis = new FileInputStream(filepath);

        /*
         HSSFWorkbook = Excel files using MS Excel 2003 or earlier
         XSSFWorkbook = Excel files using MS Excel 2007 or later
         */

        String sheetName = "Students";
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);
        Iterator<Row> rowIter = sheet.rowIterator();

        Object[][] excelData = new Object[5][4];
        int rowCounter = 0;
        int cellCounter = 0;

        while (rowIter.hasNext()) {
            Iterator<Cell> cellIter = rowIter.next().cellIterator();

            while (cellIter.hasNext()) {
                Cell cell = cellIter.next();
                excelData[rowCounter][cellCounter] = getCellValue(cell);
                cellCounter++;
            }

            rowCounter++;
            cellCounter = 0;
        }

        int rowCount = 1;
        for (Object[] row : excelData) {
            System.out.println("ROW #" + rowCount);

            for (Object cellValue : row) {
                System.out.println(cellValue);
            }
            System.out.println();
            rowCount++;
        }
    }

    static Object getCellValue(Cell cell) {
        switch(cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return cell.getNumericCellValue();
            case BOOLEAN:
                return cell.getBooleanCellValue();
            default:
                return null;
        }
    }

}
