package lesson_11.task1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {

        Set<String> words = new HashSet<>();
        words.add("aaaaa");
        words.add("bbbbb");
        words.add("cccc");
        words.add("dddd");
        words.add("eeee");

        Set <String> words1 = new LinkedHashSet<>();
        words1.add("aaaaa");
        words1.add("bbbbb");
        words1.add("cccc");
        words1.add("dddd");
        words1.add("eeee");

        System.out.println(words);
        System.out.println(words1);
    }
}
