package lesson_31.task1;

public class MyThread extends Thread {

    @Override
    public void run(){
        for (int i = 100; i < 110; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
