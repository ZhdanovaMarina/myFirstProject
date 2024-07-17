package lesson_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Question {

    private String question;
    private int score;
    private List<Option> options = new ArrayList<>();

    public Question(String question, int score) {
        this.question = question;
        this.score = score;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return score == question1.score && Objects.equals(question, question1.question) && Objects.equals(options, question1.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, score, options);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(question + "\n");
        for (int i = 0; i < options.size(); i++) {
            stringBuilder.append(i + 1).append(" ").append(options.get(i)).append("\n");
        }
        return stringBuilder.toString();
    }


    public void addOption(Option ... option){
        List<Option> optionList = Arrays.asList(option);
        options.addAll(optionList);
    }






}
