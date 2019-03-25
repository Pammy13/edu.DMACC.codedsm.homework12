package edu.dmacc.codedsm.Homework12;

import javax.smartcardio.Card;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Blackjack {

    public static class DeckRandomizer {

        private static final Random random = new Random();


        public static void main(String[] args) {
            Map<String, List<Integer>> deck = initializeDeck();
            List<Card> playerHand = new ArrayList<>();
            List<Card> dealerHand = new ArrayList<>();

            List<Card> playerCards = DeckRandomizer.chooseRandomCards(deck, 2);
            playerHand.addAll(playerCards);
            for (Card card : playerCards) {
                removeCardFromDeck(deck, card);
            }

            System.out.println("Player's hand is: ");
            showHand(playerHand);

            List<Card> dealerCards = DeckRandomizer.chooseRandomCards(deck, 2);
            dealerHand.addAll(dealerCards);
            for (Card card : dealerCards) {
                removeCardFromDeck(deck, dealerCards.get(0));
            }

            System.out.println("Dealer's hand is: ");
            showHand(dealerHand);

            boolean continueGame = true;
            Scanner in = new Scanner(System.in);
            while (continueGame) {

                System.out.println("Player enter 1 to Hit, 2 to Stand");
                String input = in.next();

                if (input.equals("1")) {
                    List<Card> nextPlayerCard = DeckRandomizer.chooseRandomCards(deck, 1);
                    playerHand.addAll(nextPlayerCard);
                    removeCardFromDeck(deck, nextPlayerCard.get(0));

                } else if (input.equals("2")) {
                    continueGame = false;

                } else {
                    showErrorMessage();
                }

                System.out.println("Player's hand is: ");
                showHand(playerHand);


            }
            int sumOfHand = 0;
            for (Card card : playerHand) {
                switch (sumOfHand = sumOfHand + card.value) {
                }

                System.out.printf("Players\'s Hand was %d points.\n", sumOfHand);

                updateDealerHand(dealerHand, dealerCards, deck);
                int sumOfDealerHand = 0;
                for (Card card : dealerCards) {
                    sumOfDealerHand = sumOfDealerHand + card.value;
                }
                System.out.printf("Dealer\'s Hand was %d points.\n", sumOfDealerHand);

            }

            private static List<Card> chooseRandomCards (Map < String, List < Integer >> deck,int i){
            }

            //iterate over dealerHand, add them to dealer hand, if check with each card, hit or stand
            public static void updateDealerHand
            (List < Card > hand, List < Card > dealerHand, Map < String, List < Integer >> deck){
                for (int i = 0; i < 21; i++) ;
                boolean continueGame = true;
                Scanner in = new Scanner(System.in);
                while (continueGame) {

                    System.out.println("Dealer 1 to Hit, 2 to Stand");
                    String input = in.next();

                    if (input.equals("1")) {
                        List<Card> dealerCards = DeckRandomizer.chooseRandomCards(deck, 1);
                        dealerHand.addAll(dealerCards);// dealerHand.addAll(chosenCards);/////////ended here
                        for (Card card : dealerCards) {
                            removeCardFromDeck(deck, dealerCards.get(0));
                        }
                    } else if (input.equals("2")) {
                        continueGame = false;

                    } else {
                        showErrorMessage();
                    }
                    System.out.println("Dealer's hand is: ");
                    showHand(dealerHand);
                }

            }

            private static Map<String, List<Integer>> initializeDeck () {
                Map<String, List<Integer>> deck = new HashMap<>();
                deck.put("Clubs", createCards());
                deck.put("Diamonds", createCards());
                deck.put("Spades", createCards());
                deck.put("Hearts", createCards());

                return deck;

            }

            private static List<Integer> createCards () {
                List<Integer> cards = new ArrayList<>();

                for (int i = 1; i < 14; i++) {
                    cards.add(i);
                }
                return cards;
            }

            private static void removeCardFromDeck (Map < String, List < Integer >> deck, Card card){
                List<Integer> cardsInSuit = deck.get(card.suits);
                cardsInSuit.remove(card.value);
            }

            private static void showHand (List < Card > playerHand) {
                for (Card card : playerHand) {
                    final PrintStream printf;
                    printf = System.out.printf("%s - %d, ", card.suits, card.value);
                }
                System.out.println("\n");

            }

            private static void showErrorMessage () {
                System.out.println("Invalid input");

            }

        }
    }
