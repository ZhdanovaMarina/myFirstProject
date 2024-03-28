package lesson_16.task1.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Print print = new Print();
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(2);

        System.out.println(print.getFirstElement(list));

    }

}
