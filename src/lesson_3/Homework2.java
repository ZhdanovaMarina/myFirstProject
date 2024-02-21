package lesson_3;

import java.util.Scanner;

public class Homework2 extends Shape {

    @Override
    public double perimetrOfSquare(int a) {
        return a * 4;
    }

    @Override
    public double perimetrOfCircle(int r) {
        return 2 * 3.14 * r;
    }

    @Override
    public double perimetrOfRectangle(int a, int b) {
        return 2 * ( a + b);
    }

    public static void main(String[] args) {
        // 1. Написать мини-справочник по геометрии. Программа должна считывать из консоли с клавиатуры
        // фигуру - прямоугольник, квадрат или круг. Для введённой фигуры вывести в консоль формулы
        //расчёта площади и периметра. Не нужно считать какие-то конкретные значения, просто формулы.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название фигуры: ");
        String number3 = scanner.nextLine();

        if (number3.equalsIgnoreCase("квадрат")) {
            System.out.println("Формула расчета перимерта квадрата: P = a + a + a + a, где a — сторона.");
            System.out.println("Формула расчета площади квадрата: S = a × a = a2, где S — площадь, a — сторона.");
        }
        if (number3.equalsIgnoreCase("круг")) {
            System.out.println("Формула расчета перимерта круга: C = 2 · π · r , где C это периметр, r – радиус, π – число пи.");
            System.out.println("Формула расчета площади круга: S = π × r2, где r — это радиус, π — число пи.");
        }
        if (number3.equalsIgnoreCase("прямоугольник")) {
            System.out.println("Формула расчета перимерта прямоугольника: P = a + b + c + d, где a, b, c, d — стороны. P = 2 × (a + b), где a и b — соседние стороны.");
            System.out.println("Формула расчета площади прямоугольника: S = a × b, где S — площадь; a, b — длина и ширина.");
        }
        System.out.println("--------------------------------");
    }
}
