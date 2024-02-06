package lesson_3;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        // 2. Вывести в консоль все числа от 40 до 20 в порядке убывания.
        for (int i = 40; i >= 20; i--) {
            System.out.println(i);
        }
        System.out.println("--------------------------------");


        // 3. Вывести в консоль сумму всех нечётных чисел от 20 до 60.
        int a = 20;
        int b = 60;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        System.out.println("--------------------------------");


        // 4. Вывести в консоль 20 раз фразу "Это строка номер n", где n - номер строки
        int number = 0;
        for (int i = 0; i < 20; i++) {
            number++;
            System.out.println("Это строка номер " + number);
        }
        System.out.println("--------------------------------");



    }
}
