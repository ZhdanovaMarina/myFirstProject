package BlackJack;

import BlackJack.interfaces.IBlackJack;
import BlackJack.interfaces.IDeck;
import BlackJack.interfaces.IPlayer;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BlackJack implements IBlackJack {

    IDeck deck = new Deck();
    private Set<IPlayer> players = new HashSet<>(); // тут будем хранить игроков


    @Override
    public void dealTwoCard() {

        for (IPlayer player : players) { // раздаем двe карты в начале игры
            player.addCardToHand(deck.getRandomCard());
            player.addCardToHand(deck.getRandomCard());
        }

    }

    @Override
    public void addCardsToPlayer() {
        for (IPlayer player : players) {
            while (player.isNeedAnotherCard()) {
                player.addCardToHand(deck.getRandomCard());
            }
        }
    }

    @Override
    public void printWinner() {
        // у всех перебор - победил крупье
        // перебор у всех, кроме одного игрока - победил этот игрок
        // несколько игроков в очками до 21 - победил один или несколько победителей с макс. очками
        Set<IPlayer> notBustRlayer = new HashSet<>();
        for (IPlayer player : players) {
            if (player.countValues() <= 21) {
                notBustRlayer.add(player);
            }
        }

        if (notBustRlayer.isEmpty()) { // если коллекция пустая
            System.out.println("Победил крупье!");
            return;
        }

        if (notBustRlayer.size() == 1){ // когда победил 1 игрок
            IPlayer winner = notBustRlayer.iterator().next();
            System.out.println("Победил игрок: " + winner.getName());
            return;
        }

        int maxCountValues = getMaxCount(notBustRlayer);
        System.out.println("Победители: ");
        for (IPlayer player : notBustRlayer) {
            if (player.countValues() == maxCountValues){
                System.out.println(player.getName());
                player.openCards();
            }
        }

    }

    private int getMaxCount(Set<IPlayer> winners){
        int maxCount = 0;
        for (IPlayer player : winners) {
            if (player.countValues() > maxCount){
                maxCount = player.countValues();
            }
        }
        return maxCount;
    }

    @Override
    public void addPlayerToGame(IPlayer player) {
        players.add(player);
    }


}
