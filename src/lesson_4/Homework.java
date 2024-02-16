package lesson_4;

public class Homework {
    public static void main(String[] args) {

        int[] numbers = {1, 7, 9, 4, 8, 3, 5, 6, 12};

        //Сколько в массиве четных чисел?
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                sum++;
            }

        }
        System.out.println("Четных чисел в массиве: " + sum);

        System.out.println("-------------------------------");

        //Все числа из массива, которые больше 10, но меньше 25.
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 10 && numbers[i] < 25){
                System.out.println("Числа, которые >10 и <25: " + numbers[i]);
            }

        }

        System.out.println("-------------------------------");

        //Все числа в обратном порядке. При этом дважды вывести те числа, которые являются кратными трём.
        for (int i = numbers.length - 1; i > 0; i--) {
            System.out.println(numbers[i]);
            if (numbers[i] % 3 == 0){
                System.out.println(numbers[i]);
            }
        }
        System.out.println("-------------------------------");

        // Вывести только те числа, которые содержат в себе символ 4.
        for (int i = 0; i < numbers.length; i++) {
            String s = String.valueOf(numbers[i]); // приведение числа к типу стринг
            if (s.contains("4")){
                System.out.println(s);
            }
        }
    }
}
