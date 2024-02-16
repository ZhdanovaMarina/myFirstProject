package lesson_6;

public class Homework {

    // 1. Метод должен вывести на консоль площадь треугольника, передаём в метод три стороны.
    public double areaOfTriangle(double a, double h) {
        double area = 0.5 * a * h;
        return area;
    }

    // 2. Метод должен вернуть кол-во гласных букв в тексте, который мы передаём входящим параметром
    public void vowelsLetter(String word) {
        int sum = 0;
        for (int j = 0; j < word.length(); j++) {
            switch (word.charAt(j)) {
                case 'а': case 'е': case 'ё': case 'и': case 'о': case 'у': case 'ю': case 'я': case 'э':
                case 'А': case 'Е': case 'Ё': case 'И': case 'О': case 'У': case 'Ю': case 'Я': case 'Э':
                    sum++;
            }
        }
        System.out.print(" " + sum);
    }

    // 3. Метод должен печатать на консоль фигуру ромба, ориентируясь на входящий параметр - размер массива (массив квадратный).
    //Если передан чётный размер массива, ромб не должен выводиться, вместо этого должно выводиться сообщение об ошибке.

    public void figureRhombus(int size) {
        int[][] rhombus = new int[size][size];
        if (rhombus.length != rhombus[1].length || rhombus.length % 2 == 0) {
            System.out.println("Массив не подходит по условиям задачи");
            return;
        }
        int startIndex = rhombus.length / 2;
        int endIndex = rhombus.length / 2;
        for (int i = 0; i < rhombus.length; i++) {
            for (int j = 0; j < rhombus[0].length; j++) {
                if (j >= startIndex && j <= endIndex) {
                    rhombus[i][j] = 1;
                }
            }
            if (i < rhombus.length / 2) {
                startIndex--;
                endIndex++;
            } else {
                startIndex++;
                endIndex--;
            }
        }
        for (int i = 0; i < rhombus.length; i++) {
            for (int j = 0; j < rhombus[0].length; j++) {
                System.out.print(rhombus[i][j] + " ");
            }
            System.out.println();
        }
    }



}

