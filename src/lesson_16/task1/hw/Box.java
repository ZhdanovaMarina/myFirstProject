package lesson_16.task1.hw;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits = new ArrayList<>();

    public Box(List<T> fruits) {
        this.fruits = fruits;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() { // метод высчитывает вес коробки
        double totalWeight = 0.0f;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> box) {
        if (this.getWeight() == box.getWeight()) {
            return true;
        } else
            return false;
    }

    public void transfer(Box<T> box){ // метод пересыпает фрукты из коробки
        for (T fruit : fruits) {
            box.addFruit(fruit);
        }
        fruits.clear();
    }


}
