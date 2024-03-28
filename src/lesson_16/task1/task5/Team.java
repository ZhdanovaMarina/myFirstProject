package lesson_16.task1.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T> {

    private String  name;
    private List<T> participants = new ArrayList<>();

    public void addParticipant(T participant){
        participants.add(participant);
    }

    public void printWinner(Team<?> team){
        Random random = new Random();
        int randomInt = random.nextInt(2);
        if (randomInt == 0){
            System.out.println("Победители " + getName());
        }else {
            System.out.println("Победители " + team.getName());
        }
    }

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
