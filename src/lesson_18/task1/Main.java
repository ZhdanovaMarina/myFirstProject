package lesson_18.task1;

import java.io.File;
import java.io.FileFilter;

public class Main {
    public static void main(String[] args) {

        File file = new File("test");
        System.out.println(file.exists()); // exists - говорит есть ли такая директория или нет (true/false)

        File[] files = file.listFiles(new FileFilter() { // listFiles - возвращает массив файлов
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".txt") || pathname.getName().endsWith(".docx");
            }
        });

        for (File file1 : files) {
            System.out.println(file1.getName());
        }
    }
}
