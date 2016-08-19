import java.io.*;
import java.util.*;
import java.util.Scanner;

public class RunApp {

    public static void main(String []args) {
      User user = new User();
      Deck _deck = new Deck();
      Dealer dealer = new Dealer();
      ArrayList<Card> hand = new ArrayList<Card>();

      List<Card> unshuffledDeck = _deck.deck;
      List<Card> shuffledDeck = dealer.shuffle(unshuffledDeck);
      hand = dealer.dealHand(shuffledDeck, user.numCards);

      Collections.sort(hand);

      for (Card card : hand) {
        card.printCard();
      }
    }
}
