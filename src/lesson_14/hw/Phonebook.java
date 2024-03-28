package lesson_14.hw;

import java.util.*;

public class Phonebook {
    public static void main (String[]args){
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivanov", 663347, bookPhone);
        addNumber("Petrov", 889966, bookPhone);
        addNumber("Sidorov", 555353, bookPhone);
        addNumber("Ivanov", 886644, bookPhone);
        addNumber("Petrov", 102030, bookPhone);
        addNumber("Sidorov", 333555, bookPhone);
        printBook(bookPhone);

        getNumber("Kotov", bookPhone);
        getNumber("Petrov", bookPhone);
    }

    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void getNumber(String key, Map<String, ArrayList<Integer>> map){

        if (map.containsKey(key)){
            System.out.println(key);
        } else {
            System.out.println("Такого абонента нет в справочнике!");
        }
    }

    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

}
