package com.dealer.app;

import java.util.Scanner;

public class Player {
    int numCards;

    public Player() {
        this.numCards = getNumberOfCards();
    }

	private int getNumberOfCards() {
        Scanner user_input = new Scanner(System.in);

        int n;
        int deckLength = 52;

        System.out.print("How many cards would you like to deal? ->");

        n = user_input.nextInt();

        while (n > deckLength) {
            System.out.println("Error! Please enter a number less than " + deckLength);
            System.out.print("\nHow many cards would you like to deal? ->");
            n = user_input.nextInt();
        }

		return n;
	}

}