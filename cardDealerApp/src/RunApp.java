// import java.util.Sscanner;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class RunApp {

    public static void main(String []args) {
      User user = new User();
      Deck deck = new Deck(user.numDecks);
      Dealer dealer = new Dealer();
      ArrayList<Card> hand = new ArrayList<Card>();

      List<Card> unshuffledDeck = deck.deck;
      List<Card> shuffledDeck = dealer.shuffle(unshuffledDeck);
      hand = dealer.dealHand(shuffledDeck, user.numCards);

      Collections.sort(hand);

      for (Card card : hand) {
        card.printCard();
      }
    }
}
