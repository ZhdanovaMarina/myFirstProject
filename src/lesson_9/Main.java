package lesson_9;

public class Main {
    /*Домашнее задание к занятию 8:
    Применить принципы наследования к сервису расчёта площади фигур, который писали ранее.
    Подумать, какой класс нужно ещё создать, что он должен содержать.
    Для каждой фигуры сделать расчёт периметра.*/
    public static void main(String[] args) {

        Krug krug = new Krug(5);
        krug.printPerimetr();

        Oval oval = new Oval(4,5);
        oval.printPerimetr();
    }
}
