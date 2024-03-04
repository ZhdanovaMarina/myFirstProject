package lesson_11.task1;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(11);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
            //if (numbers.get(i) == 7){
           // numbers.remove(i);
           // }
        }

        System.out.println("--------------------------");

        for (Integer number : numbers){
            System.out.println(number);
        }
        System.out.println("--------------------------");

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------------------");


        System.out.println(numbers);

    }
}
