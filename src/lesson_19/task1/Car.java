package lesson_19.task1;

public class Car {
    private String vendor; // производитель
    private String color; // цвет
    private Engine engine; // двигатель

    public Car(String vendor, String color) { // конструктор внешнего класса
        this.vendor = vendor;
        this.color = color;

    }

    public void printInfo() {
        System.out.println("Характеристики автомобиля: ");
        System.out.println("Производитель " + vendor);
        System.out.println("Цвет " + color);
        System.out.println("Mощность двигателя " + engine.horsePower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

    public String getColor() {
        return color;
    }

    public class Engine { //
        private int horsePower; // лошадиные силы
        private String type; // тип двигателя

        public Engine(int horsePower, String type) { // конструктор внутреннего класса
            this.horsePower = horsePower;
            this.type = type;
        }

        public void printInfo(){
            System.out.println("Цвет " + color);
        }

    }
}
