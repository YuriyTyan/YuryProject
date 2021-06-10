package class33;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1 {

    public static void main(String[] args) throws IOException {
        String path = "E:\\Batch9\\Samples\\ExcelSample.xlsx";
        FileInputStream fios = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fios);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Row row2 = sheet.getRow(2);
        Cell cell = row2.getCell(0);
        System.out.println(cell);

    }
}
