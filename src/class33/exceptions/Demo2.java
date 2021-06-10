package class33.exceptions;

import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        if (num2 == 0) {
            System.out.println("Can not divide");
        } else {
            System.out.println(num1/num2);
        }
        System.out.println("Important code");
        System.out.println("Important code");
        System.out.println("Important code");

    }
}
