package class29;

import java.util.ArrayList;

public class ArrayListDemo6 {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("azizi");
        arrayList.add("ram");
        arrayList.add("mirage");
        //arrayList.add(10);

        for(Object obj:arrayList){
            System.out.println(((String)obj).length());
        }

        ArrayList <String>arrayList2 = new ArrayList<>();
        arrayList2.add("azizi");
        arrayList2.add("ram");
        arrayList2.add("mirage");
        //arrayList2.add(10);

        for(String obj1:arrayList2){
            System.out.println(obj1.length());
        }
    }
}
