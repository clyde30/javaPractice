import java.util.Scanner;

public class User {
  int numCards;
  int numDecks;

  public User(){
    this.numDecks = 1;
    this.numCards = getHandLength();

  }

  public int getHandLength() {
    Scanner user_input = new Scanner( System.in );

    int n;
    int deckLength = 52 * numDecks;
    System.out.print("How many cards would you like to deal? ->");
    n = user_input.nextInt();

    while (n > deckLength) {
      System.out.println("Error! Please enter a number less than " + deckLength);
      System.out.print("\nHow many cards would you like to deal? ->");
      n = user_input.nextInt();
    }
    return n;
  }
}
