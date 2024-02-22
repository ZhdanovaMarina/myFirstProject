package lesson_9;

import java.util.Objects;

public class Oval extends Krug {

    private int radius2;

    public Oval(int rad, int radius2) {
        super(rad);
        this.radius2 = radius2;
    }

   /* @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) return false;
        Oval o = (Oval) obj;
        return this.radius2 == o.radius2;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oval oval = (Oval) o;
        return (radius2 == oval.radius2 && this.getRadius() == oval.getRadius());
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius2);
    }

    @Override
    public String toString() {
        return "Овал с радиусом " + radius2;
    }

    @Override
    public void printPerimetr() {
        System.out.println("Длина овала составляет: " + Math.PI * getRadius() + radius2);
    }
}
