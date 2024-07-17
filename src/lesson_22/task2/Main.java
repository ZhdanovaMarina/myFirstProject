package lesson_22.task2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Концерт начался!");

        Singer1 singer1 = new Singer1();
        Singer2 singer2 = new Singer2();

        singer2.setDaemon(true);
        singer1.start();
        singer2.start();

        try {
            singer1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Концерт окончен!");
    }
}
