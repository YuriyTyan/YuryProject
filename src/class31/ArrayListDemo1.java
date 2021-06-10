package class31;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(1000);

        TreeSet <String> treeSet = new TreeSet<>();
        treeSet.add("AB");
        treeSet.add("AC");
        treeSet.add("AD");
        System.out.println(treeSet);
        treeSet.add("a");
        treeSet.add("$");
        treeSet.add("*");
        System.out.println(treeSet);;

    }
}
