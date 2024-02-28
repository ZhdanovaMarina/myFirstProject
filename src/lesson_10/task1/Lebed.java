package lesson_10.task1;

public class Lebed extends Bird implements Swim{
    @Override
    public void swim() {
        System.out.println("Лебедь плывет");
    }
}
