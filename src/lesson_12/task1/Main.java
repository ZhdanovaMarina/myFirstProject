package lesson_12.task1;

import java.util.*;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Coin coin1 = new Coin(10, 1921, 15, "Золото");
        Coin coin2 = new Coin(5, 1900, 5, "Серебро");
        Coin coin3 = new Coin(20, 1870, 7, "Бронза");
        Coin coin4 = new Coin(1, 1750, 2, "Золото");
        Coin coin5 = new Coin(2, 2001, 9, "Олово");
        Coin coin6 = new Coin(10, 1921, 15, "Золото");

        Set<Coin> coins = new HashSet<>();

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

       System.out.println("Лист до сортировки: ");
        for (Coin coin : coins) {
            System.out.println(coin);
        }

        /* List<Coin> coinList = new ArrayList<>(coins);
        for (Coin coin : coinList) {
            System.out.println(coin);
        } */

      /*  System.out.println("Сет после сортировки");
        Set<Coin> coinTreeSet = new TreeSet<>(coins);
        for (Coin coin : coinTreeSet) {
            System.out.println(coin);
        }*/

       // CoinSortUtils.printCoinByMetallAsc(coins);
       // CoinSortUtils.printCoinByMetallDesc(coins);


    }

}
