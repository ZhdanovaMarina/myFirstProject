package lesson_19.task1;

import java.util.Comparator;

public class CompByColor implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
