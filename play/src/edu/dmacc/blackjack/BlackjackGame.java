package edu.dmacc.blackjack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlackjackGame {

    public static void main(String[] args) {
        Map<String, List<Interger>> deck = new HashMap<>();
        List<Interger> cards = new ArrayList<>();
        for (int i = 1; i < 14; i++) {
            cards.add(i);

        }
        deck.put("Clubs", cards);
        deck.put("Diamonds", cards);
        deck.put("Spades", cards);
        deck.put("Hearts", cards);

        return deck;
    }
    public static List<Integer> createCards() {
        List<Integer> cards = new ArrayList<>();

        for (int i = 1; i < 14; i++) {
            cards.add(i);
        }
        return cards;

    }

    public static void main(String[] args) {
        Map<String, List<Integer>> deck = createDeck();

        for (String suitInDeck : deck.keySet()) {
            List<Integer> cardsInDeck = deck.get(suitInDeck);

            for (Integer cardValue : cardsInDeck) {
                System.out.println(suitInDeck + " - " + cardValue);
            }
        }
    }
}





