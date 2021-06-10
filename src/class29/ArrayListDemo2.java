package class29;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNG");

        System.out.println(subjects);

        ArrayList<String> subjectsThatWewantToRemove = new ArrayList<>();
        subjectsThatWewantToRemove.add("SDLC");
        subjectsThatWewantToRemove.add("Manual Testing");
        subjectsThatWewantToRemove.add("Java");

        subjects.removeAll(subjectsThatWewantToRemove);
        System.out.println(subjects);
    }
}
