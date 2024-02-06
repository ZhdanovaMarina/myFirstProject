package lesson_2;

public class Homework {
    public static void main(String[] args) {

        // Задание 1.
        int number = 10;
        if (number % 2 == 0) {
            System.out.println("Это четное число!");
        } else {
            System.out.println("Это нечетное число!");
        }
        System.out.println("-----------------------------------");


        // Задание 2.
        int x = 20;
        int y = 15;
        int z = 39;
        int q = 42;

        if (x > y & x > z & x > q) {
            System.out.println("Максимальное число: " + x);
        } else if (y > x & y > z & y > q) {
            System.out.println("Максимальное число: " + y);
        } else if (z > x & z > y & z > q) {
            System.out.println("Максимальное число: " + z);
        } else if (q > x & q > y & q > z) {
            System.out.println("Максимальное число: " + q);
        } else if (x == y | x == z | x == q) {
            System.out.println("Максимальное число: " + x);
        } else if (y == z | y == q) {
            System.out.println("Максимальное число: " + y);
        } else if (z == q) {
            System.out.println("Максимальное число: " + z);
        }
        System.out.println("-----------------------------------");

        // Задание 3.

        int a = 2;
        int b = 2;
        int c = 2;
        int d = 2;

        if (a == b & b == c & c == d & d == a) {
            System.out.println("Это квадрат!");
        } else if (a == c & b == d & a != b & b != c) {
            System.out.println("Это прямоугольник!");
        } else {
            System.out.println("Это четырехугольник!");
        }
        System.out.println("-----------------------------------");



    }
}
