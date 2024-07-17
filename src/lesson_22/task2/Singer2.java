package lesson_22.task2;

public class Singer2 extends Thread{

    @Override
    public void run() {
        while (true){

            synchronized (Monitor.MICROFON){
                try {
                    Monitor.MICROFON.wait(); // .wait() ждет, пока освободят микровон
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("--------------------");
            }

            synchronized (Monitor.MICROFON){
                Monitor.MICROFON.notify(); // .notify() говорит что он освобождает микрофон
            }

        }
    }
}
