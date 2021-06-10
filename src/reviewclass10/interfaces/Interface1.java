package reviewclass10.interfaces;

public interface Interface1 {
    int number1 = 10;
    void method1();

    default void method2() {
        System.out.println("method 1");
    }

    static void method3(){
    }
}
