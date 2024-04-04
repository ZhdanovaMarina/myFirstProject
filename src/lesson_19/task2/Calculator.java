package lesson_19.task2;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sum(){

        class Sum{
         private int innerA;
         private int innerB;

         public void printSum(){
             System.out.println("Сумма " + (innerB + innerA));
         }

            public Sum(int innerA, int innerB) {
                this.innerA = innerA;
                this.innerB = innerB;
            }
        }

        Sum sum = new Sum(a, b);
        sum.printSum();
    }


}
