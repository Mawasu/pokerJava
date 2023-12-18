package malas.personal;

public class Card {
	
	private final String suit;
	private final int number;

	public Card(String suit, int number) {
		this.suit = suit;
		this.number = number;
		
		if(!this.suit.equals("H") && !this.suit.equals("C") && !this.suit.equals("S") && !this.suit.equals("D")) {
			throw new IllegalArgumentException("Invalid suit used in Card constructor");
		} else if (this.number < 2 || this.number > 14) {
			throw new IllegalArgumentException("Card number out of bounds");
		}
	}

	public static void main(String[] args) {
		Card fake = new Card("A", 1);
	}
}


