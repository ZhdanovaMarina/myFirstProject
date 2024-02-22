package lesson_8.task_1;

public class SchoolKids extends Person{

    private String schoolName;
    private double averageRate;

    public SchoolKids(String name, int age) {
        super(name, age);
    }

    public SchoolKids(String name, int age, String schoolName, double averageRate) {
        super(name, age);
        this.schoolName = schoolName;
        this.averageRate = averageRate;
    }
}
