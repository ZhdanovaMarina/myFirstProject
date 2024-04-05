package lesson_19.lesson_20.task1;

@FunctionalInterface
public interface IFilter { // FunctionalInterface - это интерфейс, в котором есть только один абстрактный метод

    boolean test(Student student);

}
