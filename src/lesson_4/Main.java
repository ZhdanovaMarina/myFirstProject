package lesson_4;

public class Main {
    public static void main(String[] args) {

        // выести на консоль элементы массива в обратном порядке перескакивая через ячейку
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for (int i = array.length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }
        System.out.println("-----------------------------------------");
        // создать массив символов и вывести на консоль только гласные буквы

        char[] symbols = {'в', 'а', 'п', 'о', 'е', 'к', 'з', 'н', 'у'};
        for (int i = 0; i < symbols.length; i++) {
            if ((symbols[i] == 'а') || (symbols[i] == 'о')) {
                System.out.println(symbols[i]);
            }
        }
        System.out.println("-----------------------------------------");

        // задать массив чисел, вывести поочередно для каждого элемента сумму его значения и соседних элементов справа и слева
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array1.length; i++) {
            if (i == 0){
                System.out.println(array1[i] + array1[i + 1]);
            } else if (i == array1.length - 1) {
                System.out.println(array1[i] + array1[i - 1]);
            }else
            System.out.println(array1[i] + array1[i - 1] + array1[i + 1]);
        }

        System.out.println("-----------------------------------------");

        // есть массив, содержащий символы q w e r и массив a b c d
        // нужно объеденить два массива в один

        char[] qwer = "qwer".toCharArray();
        char[] abcd = "abcd".toCharArray();
        char[] result = new char[qwer.length + abcd.length];

        for (int i = 0; i < qwer.length; i++) {
            result[i] = qwer[i];
        }
        for (int i = 0; i < abcd.length; i++) {
            result[i + qwer.length] = abcd[i];
        }
        System.out.println(result);
    }
}
