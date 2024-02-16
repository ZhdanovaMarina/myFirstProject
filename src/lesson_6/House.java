package lesson_6;

public class House {

    // public  - класс или метод может быть сиден из любой точки нашей программы
    // private - данный метод (класс) виден только внутри класса
    // protected - метод (класс) будет виден только внутри нашего пакета или/ и в классах-наследниках
    // default ( по умолчанию) - non - package -  метод или класс будет доступен только в пределах данного пакета
    // static - метод, внутренний класс,поле
    // final - класс, поле, метод


    public void getInfo() {
        System.out.println("этот дом из кирпича");
    }

    public void build() {
        System.out.println("Дом построен");
    }

    private class Room { // вложенный класс

    }
}
