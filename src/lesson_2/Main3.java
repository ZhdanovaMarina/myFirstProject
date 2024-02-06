package lesson_2;

public class Main3 {
    public static void main(String[] args) {

        // Даны 3 стороны треугольника, вывести в консоль какойэто треугольник: равнобедренный, равносторонний или разносторонний.

        int sideA = 2;
        int sideB = 2;
        int sideC = 1;

        // равносторонний
        if ((sideA == sideB) && (sideB == sideC)) {
            System.out.println("Это равносторонний треугольник!");
        } else if ((sideA != sideB) && (sideB != sideC) && (sideC != sideA)) {  // разносторонний
            System.out.println("Это разносторонний треугольник!");
        } else {
        } {  //равнобедренный
            System.out.println("Это равнобедренный треугольник!");
        }

        int a = 0;

        if (a == 0) {
            System.out.println("a равно 0");
        } else if (a > 0) {
            System.out.println("a больше 0");
        } else {
            System.out.println("a меньше 0");
        }


//       int a = 5;
//
//        if (a > 10){
//            System.out.println("a больше 5");
//        }
//        System.out.println("Конец программы");
    }
}
