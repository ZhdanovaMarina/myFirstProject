package lesson_6;

public class Main1 {
    public static void main(String[] args) {

        House house = new House();
        house.getInfo();

        System.out.println("-------------------------");

        // есть адрес электронной почты, необходимо провалидировать на корректность и выдать пользователю соответствующее сообщение

        String email = "te@st@mail.ru";

        if (!email.contains("@")) {
            System.out.println("Данный адрес некорректен!");
            return;
        }
        String[] split = email.split("@");// метод .split() возвращает массив строк
        if (split.length != 2) {
            System.out.println("Данный адрес некорректен!");
        }
        if (email.startsWith("#") || email.startsWith("!")){ //метод определяет, начинается ли строка с символов указанных в скобках, возвращая true или false.
            System.out.println("Данный адрес некорректен!");
            return;
        }

        System.out.println("Адрес корректен");
    }
}
