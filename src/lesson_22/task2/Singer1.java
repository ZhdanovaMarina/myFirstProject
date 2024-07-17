package lesson_22.task2;

public class Singer1 extends Thread {

    private boolean isStopped = false;
    private int count = 0;

    @Override
    public void run() {
        while (!isStopped) {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("****************");
            }
            count++;

            synchronized (Monitor.MICROFON) {
                Monitor.MICROFON.notify(); // .notify() говорит что он освобождает микрофон
            }

            if (count >= 3) {
                isStopped = true;
                continue;
            }

            synchronized (Monitor.MICROFON) {
                try {
                    Monitor.MICROFON.wait(); // .wait() ждет, пока освободят микровон
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
