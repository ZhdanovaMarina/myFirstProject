package lesson_22.task1;

public class MyThread1 extends  Thread{

    @Override
    public void run(){
        for (int i = 100; i < 110; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Thread.currentThread().setName("MyThread1");
        System.out.println("поток завершил работу " + Thread.currentThread().getName());
    }

}
