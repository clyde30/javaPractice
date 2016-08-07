// import java.util.Sscanner;
import java.io.*;
import java.util.*;

public class RunApp {

    public static void main(String []args) {
      Deck deck = new Deck(1);
      Dealer dealer = new Dealer();

      List<Card> unshuffledDeck = deck.deck;
      List<Card> shuffledDeck = dealer.shuffle(unshuffledDeck);
      List<Card> hand = dealer.dealHand(shuffledDeck, 5);

      for (Card card : hand) {
        card.printCard();
      }
    }
}
