package com.dealer.app;

public class Card implements Comparable<Card>{
    String suit;
    int number;
    String name;
    int value;

    public Card(int number, String suit) {
        this.number = number;
        this.suit = suit;
        this.value = number;
        this.name = getFaceCard(number);

        
    }
    private String getFaceCard(int num) {
        String card;

        switch(num) {
            case 11 : card = "Jack";
            break;
            
            case 12 : card = "Queen";
            break;
            
            case 13 : card = "King";
            break;
            
            case 14 : card = "Ace";
            break;

            default : card = Integer.toString(num);
        }
        return card; 
    }

    private int getNumber () {
        return number;
   }

    public int compareTo(Card compareCard) {
        int compareNumber=((Card)compareCard).getNumber();
        return this.number - compareNumber;
   }
}