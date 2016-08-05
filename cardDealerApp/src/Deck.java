import java.util.*;

public class Deck {
  List newDeck = new ArrayList();
  List shuffledDeck = new ArrayList();

  public Deck() {
    String[] suitList = {"Hearts", "Clubs", "Spades", "Diamonds"};

    for (String suit : suitList) {
      for(int i = 2; i <= 14; i++) {
        Card card = new Card(i, suit);
        newDeck.add(card);
      }
    }
    shuffle();
  }

  public void shuffle() {
    System.out.println("Shuffling");
    List<Card> deck = newDeck;
    while (0 < deck.size()){
      Random r = new Random();
		  int i = r.nextInt(deck.size());

      Card card = deck.get(i);
      card.printCard();
      shuffledDeck.add(card);
      deck.remove(i);
  }
}
}
