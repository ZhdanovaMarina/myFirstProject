package lesson_17.task1;

import lesson_17.HW.CopyWithGuava;

public class Main {

    public static void main(String[] args) {

        ICopyUtils iCopyUtils = new CopyWithIo();
        long start = System.currentTimeMillis();
        iCopyUtils.copy("C:\\Users\\User\\Desktop\\video1.mp4", "1.mp4");
        long end = System.currentTimeMillis();
        System.out.println("Время копирования с помощью метода IO: " + (end - start));
        // 10 162

        ICopyUtils iCopyUtils1 = new CopyWithNIO();
        long start1 = System.currentTimeMillis();
        iCopyUtils1.copy("C:\\Users\\User\\Desktop\\video1.mp4", "2.mp4");
        long end1 = System.currentTimeMillis();
        System.out.println("Время копирования с помощью метода NIO: " + (end1 - start1));
        //120

        ICopyUtils iCopyUtils2 = new CopyWithApache();
        long start2 = System.currentTimeMillis();
        iCopyUtils2.copy("C:\\Users\\User\\Desktop\\video1.mp4", "3.mp4");
        long end2 = System.currentTimeMillis();
        System.out.println("Время копирования с помощью метода Apache: " + (end2 - start2));
        //132


        ICopyUtils iCopyUtils3 = new CopyWithGuava();
        long start3 = System.currentTimeMillis();
        iCopyUtils3.copy("C:\\Users\\User\\Desktop\\video1.mp4", "4.mp4");
        long end3 = System.currentTimeMillis();
        System.out.println("Время копирования с помощью метода Guava: " + (end3 - start3));
        //115


    }

}

