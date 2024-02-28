package lesson_9;

public class Square extends Figura{

    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }


    @Override
    public void printPerimetr() {
        System.out.println("Периметр квадрата составляет: " + 4 * a);
    }
}
