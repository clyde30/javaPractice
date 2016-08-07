public class Card {

  String suit;
  int value;
  String name;

  public Card(int value, String suit) {
    this.value = value;
    this.suit = suit;

    this.name = getFaceCards(value) + " of " + suit;
  }

  public void printCard() {
    System.out.println(name);
  }

  public String getFaceCards(int value) {
    String card;

    switch(value)
    {
      case 11 : card = "Jack";
      break;

      case 12 : card = "Queen";
      break;

      case 13 : card = "King";
      break;

      case 14 : card = "Ace";
      break;

      default : card = Integer.toString(value);
    }

    return card;
  }

}
