package class29;

public class WrapperClassDemo2 {

    public static void main(String[] args) {

        int a = 10;
        Integer aa = a;
        a = aa;
        String str = new String ("blahblah");// longer way
        str = "blahblah";

        Integer integer = new Integer (10); // longer (unnecessary) way boxing
        Integer integer1 = 45; // autoboxing (shorter way)
        int abc = integer.intValue();// unboxing
        abc = integer; // auto unboxing
    }
}
