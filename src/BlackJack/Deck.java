package BlackJack;

import java.util.Random;

public class Deck {

    public Card[] cards = new Card[52];

    public Deck(){
        cards[0] = new Card("Двойка червей", 2);
        cards[1] = new Card("Двойка бубен", 2);


    }

    public Card getRandomCard (){
        // int index = (int) Math.random() * 52;
        int index = new Random().nextInt(52);
        Card card = cards[index];
        return card;
    }

}
