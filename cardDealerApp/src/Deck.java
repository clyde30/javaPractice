import java.util.*;

public class Deck {
  List deck = new ArrayList();

  public Deck(int numDecks) {
    String[] suitList = {"Hearts", "Clubs", "Spades", "Diamonds"};

    for (int n = 0; n < numDecks; n++) {
      for (String suit : suitList) {
        for(int i = 2; i <= 14; i++) {
          Card card = new Card(i, suit);
          deck.add(card);
        }
      }
    }
  }
}
