package lesson_6;

public class Rhombus {

    public static void main(String[] args) {
/*      Для желающих. Заполнить двумерный массив ромбиком как на третьей картинке.
        Зелёные поля заполнить единицами, жёлтые - нулями. Массив должен быть квадратным
        (число строк равно числу столбцов). Размер массива должен быть нечётным.
        Код должен корректно работать при любом нечётном размере массива.*/
        int size = 7;
        int[][] rhombus = new int[7][7];
        if (rhombus.length != rhombus[1].length || rhombus.length % 2 == 0) {
            System.out.println("Массив не подходит по условиям задачи");
            return;
        }
        int startIndex = rhombus.length / 2;
        int endIndex = rhombus.length / 2;
        for (int i = 0; i < rhombus.length; i++) {
            for (int j = 0; j < rhombus[0].length; j++) {
                if (j >= startIndex && j <= endIndex) {
                    rhombus[i][j] = 1;
                }
            }
            if (i < rhombus.length / 2) {
                startIndex--;
                endIndex++;
            } else {
                startIndex++;
                endIndex--;
            }
        }
        for (int i = 0; i < rhombus.length; i++) {
            for (int j = 0; j < rhombus[0].length; j++) {
                System.out.print(rhombus[i][j] + " ");
            }
            System.out.println();
        }
    }
}
