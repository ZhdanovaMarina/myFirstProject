package lesson_7;

public class Cat {

    private String name;
    private int age;
    private String color;
    private int food = 0;

    public void catInfo (){
        if (name == null && age == 0){
            System.out.printf("У этого кота %s цвет.\n", color);
        }else if (age == 0){
            System.out.printf("Кот по кличке %s, цвет: %s.\n", name, color);
        }else
        System.out.printf("Кот по кличке %s, цвет: %s, возраст: %d лет.\n", name, color, age);
    }
    public void sayMeow (){
        System.out.println("Мяу!");
    }

    public void feedTheCat(int feed){

        food = food + feed;
        if (name == null) {
            System.out.printf("Кот накормлен, остаток еды %d\n", food);
        }else {
            System.out.printf("Кот по имени %s накормлен, остаток еды %d\n", name, food);
        }
        if (food > 10 && name != null){
            System.out.printf("Кот по имени %s сыт!\n", name);
        } else if (food > 10 && name == null){
            System.out.println("Кот сыт!");
        }else if (food > 10 && name != null){
            System.out.printf("Кот по имени %s голоден!\n", name);
        }else {
            System.out.println("Кот голоден!");
        }
    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Cat(String color) {
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

