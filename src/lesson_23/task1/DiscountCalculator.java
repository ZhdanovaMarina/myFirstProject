package lesson_23.task1;

public class DiscountCalculator {

    public int sumAfterDiscount(int sum){
        if (sum < 1000){
            return sum;
        } else {
            return (int)(sum*0.98);
        }
    }

    public boolean test(){
        return true;
    }

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.sumAfterDiscount(2000));
    }

}
