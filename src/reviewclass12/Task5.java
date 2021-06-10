package reviewclass12;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task5 {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Ram");
        set.add("Brian Espejo");
        set.add("Darina Nazarenko");
        set.add("Ram");
        String var="";
        for(String name:set) {
            var+=name;
        }
        System.out.println(var);
    }
}
