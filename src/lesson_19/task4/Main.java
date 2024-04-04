package lesson_19.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan", "Ivanov", 20, 3.7, 1));
        studentList.add(new Student("Petr", "Petrov", 27, 5.0, 4));
        studentList.add(new Student("Max", "Kotov", 22, 4.8, 2));
        studentList.add(new Student("Semen", "Kekov", 25, 3.1, 3));
        studentList.add(new Student("Ivan", "Petrov", 22, 4.8, 1));

        StudentUtils.filter(studentList, new IFilter() {
            @Override
            public boolean test(Student student) {
                return student.getName().startsWith("I");
            }
        });

        System.out.println("-----------------");
        StudentUtils.filter(studentList, new IFilter() {
            @Override
            public boolean test(Student student) {
                return student.getAverageRate() > 4.7;
            }
        });
        System.out.println("-----------------");

        StudentUtils.filter(studentList, new IFilter() {
            @Override
            public boolean test(Student student) {
                return student.getCourse() == 2;
            }
        });



    }
}
