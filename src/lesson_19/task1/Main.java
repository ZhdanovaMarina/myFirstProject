package lesson_19.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

// 1.Обычный класс
// 2. Nested вложенный класс
// 3. Static nested - статический вложенный класс
// 4. Local nested - локальный вложенный класс
// 5. Anonimous - анонимный
public class Main {
    public static void main(String[] args) {

        Car car = new Car("Honda", "Black");
        Car.Engine engine = car.new Engine(100, "Diesel");
        car.setEngine(engine);

        //car.printInfo();
        engine.printInfo();
    }
}
