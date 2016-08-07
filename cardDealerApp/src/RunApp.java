// import java.util.Sscanner;
import java.io.*;
import java.util.*;

public class RunApp {

    public static void main(String []args) {
      Deck deck = new Deck();
      Deck deckTwo = new Deck();
      Dealer dealer = new Dealer();

      List<Card> cardDeck = deck.newDeck;
      // List<Card> cardListTwo = deckTwo.shuffled;
      List<Card> shuffledDeck = deck.shuffle(cardDeck);

      List<Card> hand = dealer.dealHand(shuffledDeck, 5);

      // List<Card> cardListShuffled = deck.shuffle(cardList);

      for (Card card : hand) {
        card.printCard();
      }
    }
}
