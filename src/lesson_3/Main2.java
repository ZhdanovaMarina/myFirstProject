package lesson_3;

public class Main2 {
    public static void main(String[] args) {

        int[] array = new int[5];
        String[] arrayString = new String[10];
        int[] a = {1, 2, 3, 4, 6, 6};

        a[1] = 10;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("-------------------------------------");

        // Создать массив длинной 10 и заполнить его числами 50.55.60.65 и тд.

        int [] array10 = new int[10];

        for (int i = 0; i < array10.length; i++) {
            array10[i] = 50 + i * 5;
        }
        for (int i = 0; i < array10.length; i++) {
            System.out.println(array10[i]);
        }

        System.out.println("-------------------------------------");

        // Создать массив и вывести на консоль среднее значение элементов массива

        int sum = 0;
        for (int i = 0; i < array10.length; i++) {
            sum = sum + array10[i];
        }
        System.out.println((double) sum / array10.length);
    }
}
