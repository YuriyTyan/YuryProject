package class32;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Orange", 12);
        map.put("Banana", 24);
        map.put("Apricot", 10);
        map.put("Mango", 20);
        map.put("Kiwi", 20);

        System.out.println(map);
        System.out.println(map.get("Mango"));
        System.out.println(map.remove("Banana"));
        System.out.println(map);
        System.out.println(map.containsKey("Banana"));
        System.out.println(map.containsKey("Orange"));
        System.out.println(map.isEmpty());
        System.out.println(map.replace("Apple", 50));
        System.out.println(map);
    }

}
