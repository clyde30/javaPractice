package com.dealer.app;

import java.util.ArrayList;

public class Dealer extends Deck{


    public Dealer() {
    }

    public Card dealCard() {
        return deck.remove(0);
    }

    public ArrayList<Card> dealHand(int i) {
        ArrayList<Card> hand = new ArrayList<Card>();

        while (i > hand.size()) {
            hand.add(dealCard());
        }
        return hand;
    }
}