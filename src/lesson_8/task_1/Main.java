package lesson_8.task_1;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Ivan", 20);
        SchoolKids kids = new SchoolKids("Petr", 10, "СОШ 12/150", 4.7);
        Student student = new Student("Egor", 19);

        person.printInfo();
        student.printInfo();
        kids.printInfo();
        System.out.println(Student.pol);

        Person.info("привет");
        Student.info("Hello");


    }
}
