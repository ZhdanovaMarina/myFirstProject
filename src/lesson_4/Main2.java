package lesson_4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // пользователь вводит пароль, пароль должен обязательно содержать хотя бы одну цифру

        System.out.println("Введите пароль: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] symbols = input.toCharArray();

        for (int i = 0; i < symbols.length; i++) {
            if ((symbols[i] == '1') || (symbols[i] == '2')) {
                System.out.println("Пароль содержит цифру");
                return;
            }
        }
        System.out.println("Пароль не содержит цифру!");
    }
}
