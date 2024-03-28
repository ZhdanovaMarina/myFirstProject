package lesson_17.task1;

public class Main {

    public static void main(String[] args) {

/*        ICopyUtils iCopyUtils = new CopyWithIo();
        long start = System.currentTimeMillis();
        iCopyUtils.copy("C:\\Users\\User\\Desktop\\video1.mp4", "1.mp4");
        long end = System.currentTimeMillis();
        System.out.println("Время копирования с помощью метода IO: " + (end - start));
        // 11 сек

        ICopyUtils iCopyUtils = new CopyWithNIO();
        long start = System.currentTimeMillis();
        iCopyUtils.copy("C:\\Users\\User\\Desktop\\video1.mp4", "2.mp4");
        long end = System.currentTimeMillis();
        System.out.println("Время копирования с помощью метода NIO: " + (end - start));
        //2 сек
*/
        ICopyUtils iCopyUtils = new CopyWithApache();
        long start = System.currentTimeMillis();
        iCopyUtils.copy("C:\\Users\\User\\Desktop\\video1.mp4", "3.mp4");
        long end = System.currentTimeMillis();
        System.out.println("Время копирования с помощью метода Apache: " + (end - start));
        //3 сек
    }

}

