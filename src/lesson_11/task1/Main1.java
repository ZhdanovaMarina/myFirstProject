package lesson_11.task1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {

        /** ArrayList - 1. использовать при добавлении элементов в конец,
         *              2. для получения элемента по индексу,
         *
         *  LinkedList - 1. при добавлении или удалении элемента из начала или середину списка,
         *               2.
         */


        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Добавляем элементы в начало ArrayList");
        long start =System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            arrayList.add(010);

        }
        long end = System.currentTimeMillis();
        System.out.println("Результат работы по добавления в начало ArrayList " + (end - start));


        System.out.println("Добавляем элементы в LinkedList");
        long start1 =System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            linkedList.add(10);

        }
        long end1 = System.currentTimeMillis();
        System.out.println("Результат работы по добавления в начало LinkedList " + (end1 - start1));

        System.out.println("--------------------------------------------");

        System.out.println("Добавляем элементы в начало ArrayList");
        long start2 =System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            arrayList.add(0,10);

        }
        long end2 = System.currentTimeMillis();
        System.out.println("Результат работы по добавления в начало ArrayList " + (end2 - start2));


        System.out.println("Добавляем элементы в LinkedList");
        long start3 =System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            linkedList.add(0,10);

        }
        long end3 = System.currentTimeMillis();
        System.out.println("Результат работы по добавления в начало LinkedList " + (end3 - start3));


        System.out.println("--------------------------------------------");

        System.out.println("Получаем элементы в ArrayList");
        long start4 =System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            arrayList.get(25000);

        }
        long end4 = System.currentTimeMillis();
        System.out.println("Результат работы по Получению в ArrayList " + (end4 - start4));


        System.out.println("Получаем элемент в LinkedList");
        long start5 =System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            linkedList.get(25000);

        }
        long end5 = System.currentTimeMillis();
        System.out.println("Результат работы по Получению в LinkedList " + (end5 - start5));


    }
}
