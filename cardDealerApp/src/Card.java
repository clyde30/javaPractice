public class Card {

  String suit;
  int value;
  String name;

  public Card(int value, String suit) {
    this.value = value;
    this.suit = suit;
    String valueStr = Integer.toString(value);

    this.name = valueStr + " of " + suit;
  }

  public void printCard() {
    System.out.println(name);
  }

}
