package lesson_7;

public class Main2 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Василий", 5, "черный");
        Cat cat2 = new Cat("Милка", "белый");
        Cat cat3 = new Cat("серый");

        cat1.catInfo();
        cat2.catInfo();
        cat3.catInfo();

        cat1.sayMeow();

        cat1.feedTheCat(11);
        cat2.feedTheCat(5);
        cat3.feedTheCat(12);

        cat2.feedTheCat(15);



    }
}
