package lesson_30;

import java.util.Objects;

public class Option {

    private String optionValue;
    private boolean isCorrect;
    private boolean isSelected;

    public Option(String optionValue, boolean isCorrect) {
        this.optionValue = optionValue;
        this.isCorrect = isCorrect;
    }


    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Option option = (Option) o;
        return isCorrect == option.isCorrect && isSelected == option.isSelected && Objects.equals(optionValue, option.optionValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(optionValue, isCorrect, isSelected);
    }


    @Override
    public String toString() {
        return optionValue;
    }
}
