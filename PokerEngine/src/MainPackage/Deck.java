package MainPackage;

public class Deck {

	// private Card[] DeckOfCards;
	private int[] deck;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Deck() {
		deck = new int[52];
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King" };

		// Initialize cards
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		
		shuffle();
		
		// Display the first four cards
		for (int i = 0; i < deck.length; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println(i +1 + ". Card number " + deck[i] + ": " + rank + " of "
					+ suit);
		}
	}

	void shuffle() {
		// Shuffle the cards
		for (int i = 0; i < deck.length; i++) {
			// Generate an index randomly
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
	}

	// Card draw() {
	// // return next card
	//
	// }
	
	// int cardsRemaining() {
	// // how many cards remaining to be drawn
	//
	// }

}
