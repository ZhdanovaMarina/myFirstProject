package lesson_12.task1;

import java.util.Objects;

public class Coin implements Comparable<Coin>{
    private int nominal;

    private int year;
    private double diameter;
    private String metal;


    @Override
    public int compareTo(Coin secondCoin) {
        // this - это первая монета
        // secondCoin - вторая монета

        if (secondCoin == null){
            System.out.println("Монета не может быть null");
            return 0;
        }

        if (this.getNominal() != secondCoin.getNominal()){
            return this.getNominal() - secondCoin.getNominal();
        }
        if (this.getYear() != secondCoin.getYear()){
            return this.getYear() - secondCoin.getYear();
        }
        if (this.getDiameter() != secondCoin.getDiameter()){
            return Double.compare(this.getDiameter(), secondCoin.getDiameter());
        }
        return this.getMetal().compareTo(secondCoin.getMetal());
    }


    public Coin(int nominal, int year, double diameter, String metal) {
        this.nominal = nominal;
        this.year = year;
        this.diameter = diameter;
        this.metal = metal;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return nominal == coin.nominal && year == coin.year && Double.compare(diameter, coin.diameter) == 0 && Objects.equals(metal, coin.metal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, year, diameter, metal);
    }

    @Override
    public String toString() {
        return String.format("Монета с номиналом %d, %d года, диаметром %.2f, материал %s", nominal, year, diameter, metal);
    }

}
