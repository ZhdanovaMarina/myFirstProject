package lesson_10.task2;

public class Main {
    public static void main(String[] args) {

        IMatrix matrix = new Matrix(3,4);
        double[][] array = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        IMatrix matrix1 = new Matrix(array);

         // matrix1.printToConsole();
        System.out.println(matrix1.getRows());
        System.out.println(matrix1.getColumns());


    }
}
