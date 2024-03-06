package lesson_12.task1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CoinSortUtils {

    public static void printCoinByMetallAsc(Set<Coin> coins) {
        TreeSet<Coin> sortedCoin = new TreeSet<>(new ByMetalAscComparator());
        sortedCoin.addAll(coins);
        System.out.println();
        System.out.println("Коллекция после сравнения по возрастанию");

        for (Coin coin : sortedCoin) {
            System.out.println(coin);
        }
    }

    public static void printCoinByMetallDesc(Set<Coin> coins) {
        TreeSet<Coin> sortedCoin = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin firstCoin, Coin secondCoin) {
                if (! firstCoin.getMetal().equals(secondCoin.getMetal())){
                    return (-1) * firstCoin.getMetal().compareTo(secondCoin.getMetal());
                }

                if (firstCoin.getNominal() != secondCoin.getNominal()){
                    return firstCoin.getNominal() - secondCoin.getNominal();
                }
                if (firstCoin.getYear() != secondCoin.getYear()){
                    return firstCoin.getYear() - secondCoin.getYear();
                }
                return Double.compare(firstCoin.getDiameter(), secondCoin.getDiameter());
            }
        });
        sortedCoin.addAll(coins);
        System.out.println();
        System.out.println("Коллекция после сравнения по убыванию");

        for (Coin coin : sortedCoin) {
            System.out.println(coin);
        }


    }


}
