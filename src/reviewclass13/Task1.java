package reviewclass13;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Enter the numbers");
        Scanner scanner = null;
        while (true){
            try {
                scanner = new Scanner(System.in);
                int x = scanner.nextInt();
                System.out.println(x);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input");

            }
        }
    }
}
