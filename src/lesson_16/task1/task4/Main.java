package lesson_16.task1.task4;
import lesson_16.task1.Info;
import java.util.ArrayList;
import java.util.List;

public class Main  {

    public static void main(String[] args) {
        // <?> - т.е. сюда можно передать любой тип данных
        // <? extends X> - т.е метод может работать с любыми типами - наследниками Х
        // <? super X> - т.е метод может работать с любыми типами - предками Х
        // <T extends Animal> - т.е метод может работать с любыми типами - наследниками Animal


        Info <String> infoString = new Info<>();

        List<String> listString = new ArrayList<>();
        listString.add("Hi");
        listString.add("Hello");
        listString.add("Hi men");

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);

        infoString.printElements(listInteger);
        infoString.printElements(listString);

        infoString.sumElements(listInteger);

    }

}
