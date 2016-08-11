import java.io.*;
import java.util.*;

public class Dealer {

  public Dealer () {
  }

  public ArrayList dealHand(List d, int i) {
    ArrayList<Card> hand = new ArrayList<Card>();
    List<Card> deck = new ArrayList();
    deck = d;

    while (i > hand.size()) {

      Card card = deck.remove(0);
      hand.add(card);
    }
    return hand;
    }

    public List shuffle(List d) {
      List<Card> deck = new ArrayList();
      deck = d;
      List<Card> finalList = new ArrayList();

      while (0 < deck.size()){
        Random r = new Random();
        int i = r.nextInt(deck.size());

        Card card = deck.get(i);
        // card.printCard();
        finalList.add(card);
        deck.remove(i);
    }
    return finalList;
  }
}
