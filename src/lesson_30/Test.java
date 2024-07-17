package lesson_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {

    private String name;
    private List<Question> questions = new ArrayList<>();

    public Test(String name) {
        this.name = name;
    }

    public void addQuestion(Question ... question){
        questions.addAll(Arrays.asList(question));
    }

    public void doTest(){
        System.out.println(name);

        for (Question question : questions) {
            System.out.println(question);
            int answer = getOptionNumber(question);
            question.getOptions().get(answer - 1).setSelected(true);
        }
        int userScore = getUserScore();
        int maxScore = getMaxScore();
        if(userScore >= maxScore*0.75){
            System.out.println("Поздравляем, тест пройден!");
        }else {
            System.out.println("Увы, тест  не пройден!");
        }

        System.out.printf("Вы набрали %d баллов", userScore);
    }

    private int getMaxScore(){
        int result = 0;
        for (Question question : questions) {
            result += question.getScore();
        }
        return result;
    }

    private int getUserScore() {
        int result = 0;
        for (Question question : questions) {
            for (Option option : question.getOptions()) {
                if (option.isCorrect() && option.isSelected()) {
                    result += question.getScore();
                }

            }
        }
        return result;
    }

    private int getOptionNumber(Question question){
        System.out.println("Введите вариант ответа: ");
        int result;
        while (true) {
            String answer = new Scanner(System.in).nextLine();
            try {
                result = Integer.parseInt(answer);
            } catch (NumberFormatException e) {
                System.out.println("Введено не число!");
                continue;
            }

            if (result < 1 || result > questions.size()){
                System.out.println("Ввод некорректен.");
                continue;
            }
            return result;
        }

    }








}
