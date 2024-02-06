package lesson_2;

public class Main {
    public static void main(String[] args) {

        // Домашнее задание

        double money = 1000;
        double pizzaPrice = 230;
        double chocolatePrice = 22;
        double candyPrice = 2.5;

        // кол-во пиццы
        int pizzaCount = (int) (money / pizzaPrice);
        System.out.println(pizzaCount);
        money = money % pizzaPrice;

        //кол-во шоколада
        int chocolateCount = (int) (money / chocolatePrice);
        System.out.println(chocolateCount);
        money = money % chocolatePrice;

        //кол-во конфет
        int candyCount = (int) (money / candyPrice);
        System.out.println(candyCount);

        money = (money % candyPrice);
        System.out.println(money);


    }
}
