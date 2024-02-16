package lesson_5;

public class Main2 {
    public static void main(String[] args) {

        // с помощью двухмерного массива нарисовать шахматную доску, черные клетки нарисовть с помощью 1, а белые с помощью 0
        int[][] b = new int[8][8];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if((i + j) %2 == 0){
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


    }
}
