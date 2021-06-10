package reviewclass11;

import java.sql.SQLOutput;

public class WrapperDemo {

    public static void main(String[] args) {

        String number = "10";
        Double doubleNumber = Double.parseDouble(number);
        System.out.println(doubleNumber);
        doubleNumber = 10.0/0;
        System.out.println(doubleNumber.isInfinite());
        System.out.println(Double.MAX_VALUE);

        Integer i = 10;
        String iString = i.toString();
        System.out.println(i.toString());
    }
}
