// import java.util.Sscanner;
import java.io.*;
import java.util.*;

public class RunApp {

    public static void main(String []args) {
      Deck deck = new Deck();
      Deck deckTwo = new Deck();

      List<Card> cardList = deck.newDeck;
      // List<Card> cardListTwo = deckTwo.shuffled;
      List<Card> shuffledDeck = deck.shuffle(cardList);

      // List<Card> cardListShuffled = deck.shuffle(cardList);

      for (Card card : cardList) {
        card.printCard();
      }
    }
}
