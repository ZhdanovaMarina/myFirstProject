package lesson_15.task1;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();

        try {
            person.setAge(10);
            System.out.println("Возраст установлен корректно! ");
        } catch (TooYoungException e) {
            System.out.println("Возраст не может быть менее 16");
            e.printStackTrace();
            System.out.println(e.getMessage());
/*        }catch (TooOldException e){
            System.out.println("Возраст не может быть больше 100");
        }*/
        } catch (Exception e) {
            System.out.println("Ошибка!");
        } finally {
            System.out.println("Внутри блока finally");
        }

        // Не отработает блок finally:
        // 1. если в блоке try/catch есть команда System.exit
        // 2. аварийное завершение работы программы
        // 3. если программа попала в бесконечный цикл в блоке try
        // 4. когда в try выполняется фоновый поток, при этом программа завершается в основном потоке

        System.out.println("После блока catch");


    }
}
