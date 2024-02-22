package lesson_9;

public class Krug extends Figura {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public Krug(int radius) {
        this.radius = radius;
    }

    //public Krug() {}

    @Override
    public void printPerimetr() {
        System.out.println("Длина круга составляет: " + 2 * Math.PI * radius);
    }
}
