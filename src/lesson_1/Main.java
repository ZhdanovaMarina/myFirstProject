package lesson_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int a;
        a = 7;
        double b = 1.6;

        /** задача
         * длина комнаты - 12 метров , ширина комнаты - 7 метров
         * длина стола 3 метра, ширина стола - 2 метра
         * * сколько столов войдет в комнату
         * */
        int roomLength = 12;
        int roomWidth = 7;
        int tableLength = 3;
        int tableWidth = 2;

        int tablesAtLength = roomLength / tableLength;
        int tablesAtWidth = roomWidth / tableWidth;

        int tablesCount = tablesAtLength * tablesAtWidth;

        System.out.println("Всего в комнату войдет столов: " + tablesCount);


        boolean c = false;
        System.out.println(c);

        char o = 'a';
        char oo = 182;
        System.out.println(oo);

    }
}
