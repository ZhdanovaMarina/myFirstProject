package lesson_16.task1.task5;

public class Participant {
    private int age;
    private String name;



    public Participant(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Participant() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
