package lesson_1;

public class Homework {
    public static void main(String[] args) {
        int money = 1000;
        int pizzaPrice = 230;
        int chocolatePrice = 22;
        double candyPrice = 2.5;

        int buyPizza = money / pizzaPrice; // 4 пиццы.
        int buyChocolate = (money % pizzaPrice) / chocolatePrice; // , ост. (80 р / 22 р) = 3 плитки
        int buyСandy = (int) (((money % pizzaPrice) - (buyChocolate * chocolatePrice)) / candyPrice); // ((80 р - (14р. * 3 плитки)) / 2,5р = 5 конф.
        double restOfMoney = ((money % pizzaPrice) - (buyChocolate * chocolatePrice)) - (buyСandy * candyPrice); // сдача - 1,5 р.


        System.out.println("На эти деньги мы можем купить: ");
        System.out.println("Пицца - " + buyPizza + " шт.");
        System.out.println("Шоколадки - " + buyChocolate + " шт.");
        System.out.println("Конфеты - " + buyСandy + " шт.");
        System.out.println("Сдача: " + restOfMoney + " руб.");

    }
}
