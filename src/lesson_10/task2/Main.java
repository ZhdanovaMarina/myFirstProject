package lesson_10.task2;

public class Main {
    public static void main(String[] args) {

        IMatrix matrix = new Matrix(3,4);
        double[][] array1 = {{1,2,3},
                             {4,5,6},
                             {7,8,9}};
        IMatrix matrix1 = new Matrix(array1);

        double[][] array2 = {{9,8,7},
                             {6,5,4},
                             {3,2,1}};
        IMatrix matrix2 = new Matrix(array2);

        double[][] array3 = {{9,8},
                             {6,5}};
        IMatrix matrix3 = new Matrix(array3);

         // matrix1.printToConsole();
        System.out.println(matrix1.getRows());
        System.out.println(matrix1.getColumns());

        IMatrix resultAdd = matrix1.add(matrix2);
        resultAdd.printToConsole();
        System.out.println("----------------------");

        IMatrix resultSub = matrix1.sub(matrix2);
        resultSub.printToConsole();
        System.out.println("----------------------");

        IMatrix resultMul = matrix1.mul(2);
        resultMul.printToConsole();

        matrix3.isSquareMatrix();


    }
}
