package reviewclass11;

import java.util.LinkedList;

public class LinkedListDemo2 {

    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Marrakesh");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("Virginia");
        cities.add("Palm Beach");
        cities.add("Chicago");
        cities.add("Casablanca");
        cities.remove("Chicago");
        System.out.println(cities.getFirst());
        System.out.println(cities.getLast());
        System.out.println(cities.descendingIterator());

    }
}
