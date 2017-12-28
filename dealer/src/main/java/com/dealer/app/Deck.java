package com.dealer.app;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    ArrayList<Card> unshuffledDeck = buildDeck();
    ArrayList<Card> deck;

    public Deck() {
        deck = shuffle();
    }
    
    private ArrayList<Card> buildDeck() {
        ArrayList<Card> _unshuffledDeck = new ArrayList<Card>();

        String[] suitList = { "Hearts", "Clubs", "Spades", "Diamonds" };
    
        for (String suit : suitList) {
            for (int i=2; i<=14; i++) {
                Card card = new Card(i, suit);
                _unshuffledDeck.add(card);
            }
        }
        return _unshuffledDeck;   
    }

    
    private ArrayList<Card> shuffle() {
        ArrayList<Card> shuffledDeck = new ArrayList<Card>();

        while (0 < unshuffledDeck.size()) {
            Random r = new Random();
            int i = r.nextInt(unshuffledDeck.size());

            Card card = unshuffledDeck.get(i);
            shuffledDeck.add(card);
            unshuffledDeck.remove(i);
        }

        return shuffledDeck;
    } 
}