import java.util.*;

public class Card implements Comparable<Card>{

  String suit;
  int number;
  String name;
  int value;

  public Card(int number, String suit) {
    this.number = number;
    this.value = number;
    this.suit = suit;
    this.name = getFaceCards(number) + " of " + suit;
  }

  public void printCard() {
    System.out.println(name);
  }

  public String getFaceCards(int number) {
    String card;

    switch(number)
    {
      case 11 : card = "Jack";
      break;

      case 12 : card = "Queen";
      break;

      case 13 : card = "King";
      break;

      case 14 : card = "Ace";
      break;

      default : card = Integer.toString(number);
    }

    return card;
  }

  public int getNumber () {
    return number;
  }

  public int compareTo(Card compareCard) {
    int compareNumber=((Card)compareCard).getNumber();
    return this.number - compareNumber;
  }
}
