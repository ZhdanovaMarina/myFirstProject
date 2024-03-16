package lesson_14.task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Петр", "Петров", 1);
        Student student2 = new Student(2, "Андрей", "Андреев", 3);
        Student student3 = new Student(3, "Виктор", "Кошкин", 4);
        Student student4 = new Student(4, "Юрий", "Юрков", 1);
        Student student5 = new Student(5, "Екатерина", "Петрова", 6);

        Map<Student, Double> averageMap = new HashMap<>();
        averageMap.put(student1, 2.34);
        averageMap.put(student2, 3.55);
        averageMap.put(student3, 5.0);
        averageMap.put(student4, 4.55);
        averageMap.put(student5, 3.55);

        System.out.println(averageMap);
        System.out.println(student1.hashCode());

        System.out.println("После смены курса: ");
        student1.setCourse(2);
        System.out.println(averageMap.get(student1));

        System.out.println(" Способ 1. По ключу: ");
        for (Student student : averageMap.keySet()) {
            System.out.println(student);
        }

        System.out.println(" Способ 2. По значению: ");
        for (Double value : averageMap.values()) {
            System.out.println(value);
        }

        System.out.println(" Способ 2. По парам ключ-значение: ");
        for (Map.Entry <Student, Double> entry : averageMap.entrySet()){
            String name = entry.getKey().getName();
            Double value = entry.getValue();
            System.out.printf("\nСтудент с именем %s и с средним баллом %.2f ", name, value);
        }
    }
}
