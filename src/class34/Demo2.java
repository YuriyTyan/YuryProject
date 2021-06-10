package class34;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr={10, 20};
        try{
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("Out of bound");
        }

        String name = null;

        if (name != null) {
            name.length();
        } else {
            System.out.println("Null object");
        }

        String path = "D:\\MyPrograms\\YuriyProject\\Files\\myFile.xlsx";

        File file = new File(path);
        if(file.exists()) {
            System.out.println("File found");
            try {
                FileInputStream fileInputStream = new FileInputStream(path);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
        } else {
            System.out.println("File not found");
        }
    }
}
