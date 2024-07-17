package lesson_30;

import java.awt.desktop.QuitEvent;

public class Main {

    public static void main(String[] args) {

        Test englishTest = new Test("Тест по английскому языку");
        Question question1 = new Question("I _______________ a teacher", 3);
        Option option11 = new Option("am", true);
        Option option12 = new Option("are", false);
        Option option13 = new Option("is", false);
        Option option14 = new Option("be", false);

        question1.addOption(option11, option12, option13, option14);


        Question question2 = new Question("_______________ you play chess?", 3);
        Option option21 = new Option("are", false);
        Option option22 = new Option("know", false);
        Option option23 = new Option("can", true);
        Option option24 = new Option("nave", false);

        question2.addOption(option21, option22, option23, option24);



        Question question3 = new Question("What are you doing now? I  ___________ a letter.", 3);
        Option option31 = new Option("is writting", false);
        Option option32 = new Option("be writting", false);
        Option option33 = new Option("am writting", true);
        Option option34 = new Option("write", false);

        question3.addOption(option31, option32, option33, option34);

        englishTest.addQuestion(question1, question2, question3);

        englishTest.doTest();
    }
}
