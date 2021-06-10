package class31;

import java.util.Set;
import java.util.TreeSet;

public class Task4 {
    public static void main(String[] args) {
        Set<String> countries = new TreeSet<>();
        countries.add("Ukraine");
        countries.add("Poland");
        countries.add("Spain");
        countries.add("USA");
        countries.add("Germany");
        countries.add("Russia");
        countries.add("China");
        for(String country:countries){
            System.out.println(country+ " ");
        }
        System.out.println();
        System.out.println(countries);

    }
}
