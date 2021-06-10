package class32;

import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> bestBuy = new LinkedHashMap<>();
        bestBuy.put(7664847, "Printer");
        bestBuy.put(7879885, "TV");
        bestBuy.put(7983923, "Iron");
        bestBuy.put(7648693, "Kettle");

        //Iterator <Map.Entry<Integer, String>> entrySet = bestBuy.entrySet().iterator();
        Set<Map.Entry<Integer, String>> set = bestBuy.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = bestBuy.entrySet().iterator();

        //HashMap<TreeMap<LinkedHashMap<Set<ArrayList<String>>>>>
        while(iterator .hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
    }
}
