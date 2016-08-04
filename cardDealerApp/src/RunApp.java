import java.util.Scanner;

public class RunApp {

    public static void main(String []args) {

      Scanner reader = new Scanner(System.in);
      System.out.println("Enter the number of cards to deal");
      int n = reader.nextInt();

      int numCards = n;

      // System.out.println("Dealing " + numCards + " Cards");

      Card cardOne = new Card(3, "Clubs");

      cardOne.printCard();

    }
}
