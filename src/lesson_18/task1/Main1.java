package lesson_18.task1;

import java.io.File;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {

        File file = new File("test\\1.txt");
        System.out.println(file.mkdir()); // в папке test создали папку java, mkdir создает папку только в первом уровне вложенности
        // чтобы создать папки любого уровня вложенности надо использовать метод mkdirs

        file.createNewFile(); // создает новый файл в папке test


    }
}
