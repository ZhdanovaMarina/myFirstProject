package lesson_3;

public class Main {
    public static void main(String[] args) {
        // тернарный оператор
//        int a = 0;
//
//        int b = a > 0 ? 1 : 2; // если выражение имеет ответ true, то будет 1, если false - 2
//        System.out.println(b);

//        for (int i = 0; i < 5; i++){
//            System.out.println("Привет!");
//        }
        // Задача 1. Вывести в консоль все четные числа от 10 до 20
        for (int i = 10; i <= 20; i++) { // (либо i+=2)
            if (i % 2 == 0){
            System.out.println(i);

            }
        }
        System.out.println("------------------------------------------");

        // Задача 2. Посчитать кол-во денег, если ихположить в банк на 5 лет, под 7 % годовых. Капитализация каждый месяц.

        double money = 1_000_000;
        int year = 5;
        int rate = 7;

        for (int i = 0; i < year * 12; i++) {
            money = money + money * rate / 100;
        }
        System.out.printf("%.2f\n", money);

        System.out.println("------------------------------------------");

        // Задача 3. Посчитать сумму чисел от a до b который делятся нацело на 2 и на 3

        int a = 1;
        int b = 30;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i %2 == 0 && i % 3 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);

        System.out.println("------------------------------------------");


        // Задача 4.
    }


}
