package lesson_8.task_1.task_2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[10];

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();


        animals[0] = cat1; //полиморфизм - это способность программы работать с любыми интерфейсами без указания определенного класса
        animals[2] = cat2;
        animals[3] = cat3;
        animals[4] = dog1;
        animals[5] = dog2;
        animals[6] = dog3;

        for (Animal animal1 : animals) {
            if (animal1 instanceof Cat){ // instanceof - ключевое слово проверяет, принадлежит ли animal1 к классу Cat
                ((Cat)animal1).say();
            }
            if (animal1 instanceof Dog){ // instanceof - ключевое слово проверяет, принадлежит ли animal1 к классу Cat
                ((Dog)animal1).say();
            }
        }

    }
}
