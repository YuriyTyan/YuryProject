package class29;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        System.out.println(subjects);

        ArrayList<String> subjects2 = new ArrayList<>();
        subjects2.add("Git");
        subjects2.add("Selenium");
        subjects2.add("TestNG");
        System.out.println(subjects2);

        subjects.addAll(1, subjects2);

        System.out.println(subjects);
        subjects.clear();
        System.out.println(subjects);

    }
}
