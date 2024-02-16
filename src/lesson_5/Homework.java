package lesson_5;

public class Homework {
    public static void main(String[] args) {

        int[][] b = new int[9][9];

        // 1. Задать двухмерный массив целых чисел размером 9 х 9.
        //Заполнить диагональ массива единицами, как на первой картинке.
        //Код должен работать корректно, если поменять размер массива, например 11 х 11.

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if(i == j){
                    b[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            int [] d = b[i];
            for (int j = 0; j < d.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------");

        // 2. То же самое, но заполнить единицами обе диагонали, как на второй картинке.
        //Код также должен работать корректно при любом размере массива.

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if((i + j)  == b.length - 1){
                    b[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            int [] d = b[i];
            for (int j = 0; j < d.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        //
    }
}
