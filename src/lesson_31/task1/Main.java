package lesson_31.task1;

public class Main {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();

        Thread thread = new Thread(new MyThread2());
        thread.start();


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
