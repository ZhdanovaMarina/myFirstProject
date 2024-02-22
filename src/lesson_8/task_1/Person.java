package lesson_8.task_1;

public class Person {
    static String pol;
    private String name;
    private int age;

    public void printInfo (){
        System.out.println("Я - человек!");
    }

    public static void info(String info){
        System.out.println(info);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
