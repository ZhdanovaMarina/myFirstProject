package lesson_2;

public class Main2 {
    public static void main(String[] args) {

        boolean b = true;
        b = 5 == 4;
        System.out.println(b);

        // Математические операторы + - * / %
        // Знак инвертирования !

        b = !(5 == 4);
        System.out.println(b);

        System.out.println(0.0 / 0.0);
        // 0.000000000000000000001

        // Дополнительные математические операторы
        // ++ -- += -= *= /= %=
        int i = 1;
        //Постфиксная запись i++
        // Префиксная запись

        System.out.println(i++);

        i += 2;// i=i+2
        System.out.println(i);

        // Логические операторы == != < > <= >=  | &  || ! &&
        //

        boolean c = 4 >= 5;
        boolean q = true;
        boolean w = false;
        boolean e = q & w;

        System.out.println(e);



    }
}
