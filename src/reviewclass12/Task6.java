package reviewclass12;

import java.util.ArrayList;

public class Task6 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(22);
        arrayList.add(120);
        Integer sum = 0;
        for(Integer num:arrayList) {
            sum+=num;
        }
        System.out.println(sum);
    }
}
