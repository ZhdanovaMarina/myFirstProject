package lesson_16.task1;

import java.util.List;

public class Info<T>{

    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Info() {
    }

    public void printElements(List<?> list){
        for (Object object : list) {
            System.out.println(object);
        }
    }

    public void sumElements(List<? extends Number> list){
        double sum = 0;

        for (Number object : list) {
           sum = sum + object.doubleValue();
        }
        System.out.println(sum);
    }

}
