import java.io.*;
import java.util.*;

public class Dealer {

  public Dealer () {
  }

  public ArrayList dealCards(List d, int i) {
    ArrayList<Card> cards = new ArrayList<Card>();
    List<Card> deck = new ArrayList();
    deck = d;

    while (i > cards.size()) {

      Card card = deck.remove(0);
      cards.add(card);
    }
    return cards;
    }

    public List shuffle(List d) {
      List<Card> deck = new ArrayList();
      deck = d;
      List<Card> finalList = new ArrayList();

      while (0 < deck.size()){
        Random r = new Random();
        int i = r.nextInt(deck.size());

        Card card = deck.get(i);
        finalList.add(card);
        deck.remove(i);
    }
    return finalList;
  }

  public ArrayList removeCards(ArrayList hand, ArrayList<Integer> discards) {
    for (Integer number : discards) {
      hand.remove(number - 1);
    }
    return hand;
  }
}
