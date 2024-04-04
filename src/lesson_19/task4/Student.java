package lesson_19.task4;

import java.util.Objects;

public class Student {

    private String name;
    private String surname;
    private int age;
    private double averageRate;
    private int course;

    public Student(String name, String surname, int age, double averageRate, int course) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageRate = averageRate;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", averageRate=" + averageRate +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(averageRate, student.averageRate) == 0 && course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, averageRate, course);
    }
}
