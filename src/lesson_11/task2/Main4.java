package lesson_11.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Main4 {
    public static void main(String[] args) {

        List<Integer> listA = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> listB = new ArrayList<>(List.of(4, 5, 6, 7));

        CollectionUtils utils = new CollectionUtilsImpl();
        Collection<Integer> union = utils.union(listA, listB);          //
        System.out.println("Объединение двух коллекций с дубликатами: " + union);
        System.out.println("---------------------------------");

        System.out.println("Объединение двух коллекций без дубликатов: " + utils.unionWithoutDuplicate(listA, listB)); //
        System.out.println("---------------------------------");

        System.out.println("Пересечение двух коллекций без дубликатов: " + utils.intersectionWithoutDuplicate(listA, listB)); //
        System.out.println("---------------------------------");

        System.out.println("Пересечение двух коллекций с дубликатами: " + utils.intersection(listA,listB));
        System.out.println("---------------------------------");

        System.out.println("Разность двух коллекций: " + utils.difference(listA, listB));
    }
}
