package lesson_16.task1.task6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(1);
        list.add("Mek");
        for (Object object : list) {
            System.out.println(object);
        }
    }


}
