package class32;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class MapDemo3 {


    public static void main(String[] args) {

        LinkedHashMap<String,Double> items = new LinkedHashMap<>();
        items.put("soap", 5.2);
        items.put("shirt", 10.2);
        items.put("pillow", 12.0);
        items.put("blanket", 8.3);
        System.out.println(items.size());
        System.out.println(items);
        Set<String> keys = items.keySet();

        Iterator<String> iterator = items.keySet().iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if(items.containsKey("o")) {
                 iterator.remove();
                }
            }
        System.out.println(items);
        }
}
