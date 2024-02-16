package lesson_6;

public class Main {
    public static void main(String[] args) {

        // 3. **Для желающих. Заполнить двумерный массив ромбиком как на третьей картинке.
        // Зелёные поля заполнить единицами, жёлтые - нулями. Массив должен быть квадратным (число строк равно числу столбцов).
        // Размер массива должен быть нечётным. Код должен корректно работать при любом нечётном размере массива

        int size = 7;
        int[][] a = new int[7][7];

        if (a.length != a[1].length || a.length % 2 == 0) { // проверка, что массив квадратный
            System.out.println("Массив не подходит под условия задачи!");
            return;
        }

        int startIndex = a.length / 2;
        int endIndex = a.length / 2;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length/2; j++) {
                if (j >= startIndex && j <= endIndex){
                    a[i][j] = 1; // присваиваем каждой ячейке единичку
                }
            }
            if (startIndex > 0){ // пока у нас нач индекс Ю 0 мы его уменьшаем на 1, а конечный увеличиваем на единицу
                startIndex--;
                endIndex++;
            }else {
                startIndex++;
                endIndex--;
            }



        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
