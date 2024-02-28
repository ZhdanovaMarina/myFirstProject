package lesson_9;

import java.util.Objects;

public class Rectangle extends Square{

    private int b;


    public Rectangle(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return b == rectangle.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(b);
    }

    @Override
    public String toString() {
        return "Прямоугольник со стороной: " + b;
    }

    @Override
    public void printPerimetr() {
        System.out.println("Периметр прямоугольника составляет: " + 2 * (getA() + b));

    }
}
