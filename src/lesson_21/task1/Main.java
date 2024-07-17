package lesson_21.task1;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> integer = Optional.empty();
        Optional<Integer> integer1 = Optional.of(10);
        if (integer.isPresent()) {
            System.out.println("Не null");
        }

        Optional<String> optionalS = Optional.of("String");
        System.out.println(optionalS.orElse("Hello"));
    }

    public static Optional<Integer> lengthOfString(String s) {
        if (s.isEmpty()) {
            return null;
        }
        return Optional.of(s.length());
    }
}
