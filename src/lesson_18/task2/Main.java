package lesson_18.task2;

import org.apache.log4j.Logger;

public class Main {
    static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        // logger.debug("test");
        int a = 10;
        int b = 100;
        printDiv(b, a);

    }

    static void printDiv(int a, int b) {
        logger.debug("Начало работы метода: ");
        logger.info(String.format("Переданы параметры %d и %d", a, b));
        int result = b / a;
        logger.trace("Результат работы метода: " + result);
    }
}
