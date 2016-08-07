// import java.util.Sscanner;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class RunApp {

    public static void main(String []args) {
      User user = new User();
      Deck deck = new Deck(user.numDecks);
      Dealer dealer = new Dealer();

      List<Card> unshuffledDeck = deck.deck;
      List<Card> shuffledDeck = dealer.shuffle(unshuffledDeck);
      List<Card> hand = dealer.dealHand(shuffledDeck, user.numCards);

      for (Card card : hand) {
        card.printCard();
      }
    }
}
