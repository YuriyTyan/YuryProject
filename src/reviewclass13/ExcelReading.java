package reviewclass13;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class ExcelReading {
    public static void main(String[] args) throws IOException {

        String path = "D:\\MyPrograms\\YuriyProject\\Files\\userData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("EmpData");
        int noOfRows = sheet.getPhysicalNumberOfRows();
        List<Map<String, String>> allData = new ArrayList<>();
        for(int i = 0; i < noOfRows; i++) {
            Row row = sheet.getRow(i);
            int noOfCells = row.getPhysicalNumberOfCells();
            for(int j = 0; j < noOfCells; j++) {
                System.out.println(row.getCell(j)+" ");
            }
            System.out.println();
        }
    }
}
