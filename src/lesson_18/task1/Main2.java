package lesson_18.task1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main2 {
    public static void main(String[] args) throws IOException {
/*  работа с системой IO
        Reader reader = new FileReader("data.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.println(bufferedReader.readLine()); // возвращает первую строчку в файле
        System.out.println(bufferedReader.lines().count()); // возвращает кол-во строчек в файле

        Writer writer = new FileWriter("data.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        writer.append("beeee"); // записать что-то в файл
        writer.close(); // закрыть
 */


// работа с системой NIO
        Path path = Path.of("data.txt");
        System.out.println(Files.readString(path)); // считать информацию из файла
        System.out.println(Files.writeString(path, "meeeek")); // записать информацию в файл
    }
}
