package com.dealer.app;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Card Dealer
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Deck deck = new Deck();
        Dealer dealer = new Dealer();
        Player player = new Player();
        ArrayList<Card> hand = new ArrayList<Card>();

        // deal 5 card hand
        hand = dealer.dealHand(player.numCards);

        Collections.sort(hand);

        for (Card card : hand) {
            System.out.println(card.name + " of " + card.suit);
        }

    }
}
