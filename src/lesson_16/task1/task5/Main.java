package lesson_16.task1.task5;

import lesson_16.task1.Info;

public class Main {

    /* Условие задачи: айти викторина.
    // Участники задачи делятся по командам (разработчики, тестировщики и т.д.)
    // Каждой команде задаются вопросы и они набирабют очки. Тестировщики должны соревноваться только с тестировщиками.
    */
    public static void main(String[] args) {

        Developer developer1 = new Developer(20, "Jon");
        Developer developer2 = new Developer(20, "Max");

        Tester tester1 = new Tester(36, "Mark");
        Tester tester2 = new Tester(45, "Mia");

        Team <Developer> developers= new Team<>("Разработчики");
        Team <Tester> testers = new Team<>("Тестировщики");

        developers.addParticipant(developer1);
        developers.addParticipant(developer2);

        testers.addParticipant(tester1);
        testers.addParticipant(tester2);

        testers.printWinner(developers);

    }
}
