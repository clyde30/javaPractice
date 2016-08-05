// import java.util.Sscanner;
import java.io.*;
import java.util.*;

public class RunApp {

    public static void main(String []args) {
      Deck deck = new Deck();
      Deck deckTwo = new Deck();

      List<Card> cardList = deck.newDeck;
      List<Card> cardListTwo = deckTwo.newDeck;

      List<Card> cardListShuffled = deck.shuffle(cardList);

      for (Card card : cardListTwo) {
        card.printCard();
      }
    }
}
