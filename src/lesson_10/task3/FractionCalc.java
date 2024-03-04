package lesson_10.task3;

public class FractionCalc implements IFractionCalc {
    @Override
    public Fraction sum(IFraction fraction, IFraction fraction1) {
        return new Fraction(fraction.getNumerator() + fraction1.getNumerator(), fraction.getDenomerator() + fraction1.getDenomerator());
    }

    @Override
    public Fraction div(IFraction fraction, IFraction fraction1) {
        return null;
    }

    @Override
    public Fraction mul(IFraction fraction, IFraction fraction1) {
        return new Fraction(fraction.getNumerator() * fraction1.getNumerator(), fraction.getDenomerator() * fraction1.getDenomerator());
    }

    @Override
    public Fraction sub(IFraction fraction, IFraction fraction1) {
        return null;
    }
}
