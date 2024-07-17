package lesson_22.task1;

public class Main {
    public static void main(String[] args) {

        // Способы создания потоков:
        // 1. Унаследоваться от класса Thread
        // 2. Реализовать интерфейс Runnable

        MyThread1 myThread1 = new MyThread1();
        Thread myThread2 = new Thread(new MyThread2());

        myThread1.setDaemon(true);
        myThread1.start();
        myThread2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Thread.currentThread().setName("Главный");
        System.out.println("поток завершил работу " + Thread.currentThread().getName());

/*        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
*/


    }
}
