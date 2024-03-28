package lesson_16.task1.task2;

public class Pair<V, K> {

    private V value;
    private K value2;

    public Pair(V value, K value2) {
        this.value = value;
        this.value2 = value2;
    }

    public void printValue(){
        System.out.println(value);
        System.out.println(value2);
    }




}
