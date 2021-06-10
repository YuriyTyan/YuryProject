package reviewclass12;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StoringData {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir")+"/Files/userData.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook excel= new XSSFWorkbook(fileInputStream);
        Sheet sheet = excel.getSheet("EmpData");
        int physicalNumberOfRows =  sheet.getPhysicalNumberOfRows();

        List<Person1> list = new ArrayList<>();
        for (int i = 0; i < physicalNumberOfRows; i++) {
            Row row = sheet.getRow(i);
            int PhysicalNumberOfCells = row.getPhysicalNumberOfCells();
            for(int j = 0; j < PhysicalNumberOfCells; j++) {
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println();
        }
    }


}
