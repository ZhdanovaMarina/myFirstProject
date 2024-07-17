package lesson_21.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("Hello kek", "Kek Mek", "Mek");
        List<String> list1 = List.of("Hello1", "Kek1", "Mek1");

/*         Stream<String> stream = list.stream().filter(x -> x.startsWith("K"));
        List<String> collect = stream.collect(Collectors.toList());
        System.out.println(collect);

        long count = Stream.of(1, 2, 3).
                count();
        System.out.println(count);
*/

//        Stream.generate(()-> Math.random()).forEach(x -> System.out.println(x));

        String s = list.stream()
                .limit(2)
                // .flatMap(x -> Arrays.stream(x.split(" ")))
                .peek(x -> System.out.println("До peek " + x))
                // .sorted((x1, x2) ->Integer.compare(x1.length(), x2.length()) )
                // .takeWhile(x -> x.startsWith("H"))
                .filter(x -> x.startsWith("H"))
                .findFirst().orElse("");
                // .map(x->x.indexOf("H"))
                // .forEach(x -> System.out.println(x));
        System.out.println(s);
    }
}