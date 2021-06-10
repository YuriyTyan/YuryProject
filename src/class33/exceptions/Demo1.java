package class33.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "D:\\MyPrograms\\EclipseWorkspaceDirectory\\JavaBasics\\testdata\\userDate.xlsx";
        /*try {
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("No need to do anything");
        }*/

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch(Exception e) {
            System.out.println("File not found");
            System.out.println("An email was sent to the support channel");
        }
        System.out.println("Important code");
        System.out.println("other code");
        System.out.println("other code");
        System.out.println("other code");

        System.out.println("Important code");
        System.out.println("other code");
        System.out.println("other code");
        System.out.println("other code");
        System.out.println("other code");

    }
}
