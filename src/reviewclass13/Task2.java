package reviewclass13;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public  static List<Exception> getExceptionList(){

        ArrayList<Exception> list=new ArrayList<>();
        try {
            System.out.println(10/0);
        }catch ( ArithmeticException e){
            list.add(e);
        }
        try{
            String str=null;
            str.charAt(10);
        }catch (NullPointerException nullPointerException){
            list.add(nullPointerException);
        }

        try{
            int[]arr=new int[2];
            arr[5]=12;
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            list.add(arrayIndexOutOfBoundsException);
        }

        try{
            int num=Integer.parseInt("Test");
            System.out.println(num);
        }catch (NumberFormatException numberFormatException){
            list.add(numberFormatException);
        }

        return  list;
    }

    public static void main(String[] args) {

        for (Exception e:getExceptionList()
        ) {
            System.out.println(e.getMessage()); // only description of errors
            System.out.println(e);  // package name+ class name+ description
            e.printStackTrace(); // complete stacktrace
        }
    }
}
