package lesson_5;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        String[] word = {"Яблоко", "Банан", "Груша"};

       // for (int i = 0; i < word.length; i++) {
       //     System.out.println(word[i]);
       // }

      //  for (String s : word) { // этот цикл проходится по массиву сначала и до конца, больше никак
      //     System.out.println(s);
      //  }
       // System.out.println("-------------------------------------");

       // while (true) { // работает до тех пор, пока выражение не даст false
        //    System.out.println("Привет");
        //}

       // int a = 0;

        //while (a < 10) {
        //    System.out.println("Привет");
        //    a++;
       // }

        //do {
        //    System.out.println("Привет");
        //    a++;
     //
        //} while (a < 10);

        String pas = "qwe";


        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Введите пароль");
            input = scanner.nextLine();
        }while (! input.equals(pas));
        System.out.println("Успещный вход");
    }
}
