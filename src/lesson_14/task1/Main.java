package lesson_14.task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();

        ageMap.put("Bill", 30);
        ageMap.put("Max", 25);
        ageMap.put("Ivan", 20);

        System.out.println(ageMap);
        System.out.println(ageMap.get("Bill"));

        System.out.println();

    }
}
