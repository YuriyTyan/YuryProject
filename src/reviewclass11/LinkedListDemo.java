package reviewclass11;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(11);
        numbers.add(13);
        numbers.add(110);
        numbers.add(2);
        numbers.remove(new Integer((110)));

        System.out.println(numbers);
        //numbers.remove(110);
        int index = numbers.indexOf(110);
        numbers.remove();
        System.out.println(numbers);
    }
}
