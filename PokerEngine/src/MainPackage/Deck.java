package MainPackage;

public class Deck {
	
	private Card[] Deck;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public Deck() {
		
		Deck = new Card[52];
		
		for (int i=0; i < 13; i++) {
			Deck[i].setSuit("Spades");
		}
		
		for (int i=13; i < 25; i++) {
			//
		}
		
//		deck.shuffle();
	}
	
//	void shuffle() {
//		// shuffle deck of cards
//	}
//	
//	Card draw() {
//		// return next card
//	}
//	
//	int cardsRemaining() {
//		// how many cards remaining to be drawn
//	}
	
	public void listCards() {
		for (int i=0; i < Deck.length; i++) {
			//
		}
	}
}
