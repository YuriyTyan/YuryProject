package class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {

    public static void main(String[] args) {

        System.out.println("Important code");
        System.out.println("Important code");
        System.out.println("Important code");
        String path = "D:\\MyPrograms\\YuriyProject\\Files\\myFile.xlsx";
        try {
            System.out.println("Inside try block");
            FileInputStream fileInputStream = new FileInputStream(path);
            String name = null;
            name.length();
        } catch (NullPointerException exception) {
            System.out.println("Catch block");
            System.out.println("Catch block");
            System.out.println("Catch block");
        }catch(Exception nullPointerException) {
            System.out.println("Second catch block");
        }
        System.out.println("Important code after try catch");
        System.out.println("Important code after try catch");
        System.out.println("Important code after try catch");
    }
}
