package lesson_9.task2;

import lesson_9.Oval;

public class Main {
    public static void main(String[] args) {

        Object object = new Object();
        Oval oval = new Oval(3,2);

        object = 40;
        System.out.println(object);

        object = "gg bb";
        System.out.println(object);

        object = oval;
        System.out.println(object);



    }

}
