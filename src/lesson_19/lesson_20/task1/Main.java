package lesson_19.lesson_20.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan", "Ivanov", 20, 3.7, 1));
        studentList.add(new Student("Petr", "Petrov", 27, 5.0, 4));
        studentList.add(new Student("Max", "Kotov", 22, 4.8, 2));
        studentList.add(new Student("Semen", "Kekov", 25, 3.1, 3));
        studentList.add(new Student("Ivan", "Petrov", 22, 4.8, 1));


        StudentUtils.filter(studentList, student -> student.getName().startsWith("I"));
        // FunctionalInterface работает только с лямбда-выражениями

        // Predicate используется при фильтрации
        Predicate<Student> predicate1 = x -> x.getAge() >= 30;
        Predicate<Student> predicate2 = x -> x.getName().startsWith("M");

        studentList.removeIf(predicate1.and(predicate2));
        // and() сработает, если оба условия удовлетворены,
        // or() сработает либо одно условие, либо второе
        // negate() произойдет конвертация результата (тем, кому меньше 30 лет, например)

        System.out.println("После удаления");
        System.out.println(studentList);

        System.out.println("-------------------");
        Consumer<Student> consumer = y -> System.out.println(y);
        Consumer<Student> consumer1 = y -> y.setAge(y.getAge() + 30);
        Consumer<Student> consumer2 = y -> {
            y.setAge(y.getAge() + 30);
            System.out.println(y);
        };

        studentList.forEach(consumer1.andThen(consumer));




/*        StudentUtils.filter(studentList, new IFilter() {
            @Override
            public boolean test(Student student) {
                return student.getName().startsWith("I");
            }
        });
*/


// dz
/*        System.out.println("-----------------");
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
*/


    }
}
