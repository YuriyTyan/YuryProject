package class31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Azizi");
        arrayList.add("Ram");
        arrayList.add("Danilo");
        arrayList.add("Mike");
        arrayList.indexOf("Mike");

        Map<Integer, String> map = new HashMap<>();
        map.put(123456, "Azizi");
        map.put(123457, "Ram");
        map.put(123458, "Danilo");
        map.put(123459, "Mike");
        // map.put(123459, "John"); -- if you use same index in key-value pair, the value will be replaced

        System.out.println(map.get(123457));

    }
}
