import java.util.*;

public class Deck {
  List deck = new ArrayList();

  public Deck() {
    String[] suitList = {"Hearts", "Clubs", "Spades", "Diamonds"};

    for (String suit : suitList) {
      for(int i = 2; i <= 14; i++) {
        Card card = new Card(i, suit);
        deck.add(card);
        card.printCard();
      }
    }
  }
}
