package lesson_19.lesson_20.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // задача: с помощью предиката проверить упорядочена ли наша коллекция по возрастанию

        Predicate<List<Integer>> predicate = new Predicate<List<Integer>>() {
            @Override
            public boolean test(List<Integer> integers) {

                for (int i = 0; i < integers.size() - 1; i++) {
                    if (integers.get(i) > integers.get(i + 1)){
                        return false;
                    }
                }
                return true;
            }
        };

        System.out.println(predicate.test(list));

    }
}