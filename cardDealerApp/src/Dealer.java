import java.io.*;
import java.util.*;

public class Dealer {

  public Dealer () {
  }

  public List dealHand(List d, int i) {
    List<Card> hand = new ArrayList();
    List<Card> deck = new ArrayList();
    deck = d;

    while (i > hand.size()) {

      Card card = deck.remove(0);
      hand.add(card);
    }
    return hand;
    }
  }
