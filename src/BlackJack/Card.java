package BlackJack;

public class Card {

    public String name;
    public int value;

    public Card(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void open(){
        System.out.println(name);
    }
}
