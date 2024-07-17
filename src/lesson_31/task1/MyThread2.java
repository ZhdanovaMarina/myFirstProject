package lesson_31.task1;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 1000; i < 1010; i++) {
            System.out.println(i);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
