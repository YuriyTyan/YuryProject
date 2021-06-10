package reviewclass11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Marrakesh");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("Virginia");
        cities.add("Palm Beach");
        cities.add("Chicago");
        cities.add("Casablanca");
        int index = cities.indexOf("Virginia");
        cities.add(index+1,"New York");
        cities.add(0, "Alexandria");
        cities.add(0, "Lahore");

        System.out.println(cities);
        System.out.println(cities.size());
        System.out.println(cities.indexOf("Chicago"));
        System.out.println(cities.lastIndexOf("Chicago"));
        System.out.println(cities.set(0,"Chicago"));
        System.out.println(cities);
        System.out.println(cities.remove("Chicago"));
        System.out.println(cities);
        System.out.println(cities.remove(1));
        int firstIndex = 2;
        int lastIndex = 4;
        System.out.println("===========subList================");
        System.out.println(cities.subList(firstIndex, lastIndex));
        ArrayList<String> limitedCities = new ArrayList<> (cities.subList(firstIndex, lastIndex));
        System.out.println(cities.subList(firstIndex, lastIndex));

    }
}
