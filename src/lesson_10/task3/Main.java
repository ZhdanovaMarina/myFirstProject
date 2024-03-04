package lesson_10.task3;

public class Main {
    public static void main(String[] args) {
        IFraction fraction = new Fraction(3,5);
        IFraction fraction1 = new Fraction(4,9);

        IFractionCalc ifractionCalc = new FractionCalc();
        System.out.println(ifractionCalc.mul(fraction, fraction1));
        System.out.println(ifractionCalc.sum(fraction, fraction1));
    }
}
