package lesson_22.task1;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 1000; i < 1010; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        Thread.currentThread().setName("MyThread2");
        System.out.println(" поток завершил работу " + Thread.currentThread().getName());
    }

}
