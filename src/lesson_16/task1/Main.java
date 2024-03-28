package lesson_16.task1;

import lesson_8.task_1.task_2.Cat;
import lesson_8.task_1.task_2.LandAnimal;

public class Main {
    public static void main(String[] args) {

        Info<Integer> infoInteger = new Info<>(5);
        Info<String> infoString = new Info<>("Hello");

        //infoInteger= infoString; так не делают

        // info.getValue();

        String a = "Hello";
        String b = "Hello world";
        a =b;

        Cat cat = new Cat();
        LandAnimal landAnimal = cat;

        Info <LandAnimal> animalInfo = new Info<>();
        Info <Cat> catInfo = new Info<>();

       // animalInfo = catInfo; так не делают



    }

}
