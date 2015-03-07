package MainPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class Deck {
	
	private ArrayList<Card> DeckCards = new ArrayList<Card>(52);
	
	private UUID DeckNbr;
	
	public Deck()
	{
		this.DeckNbr = UUID.randomUUID();
		
		for (int i=0; i<4; i++)
		{
			eSuit suit = eSuit.values()[i];
			for (int j=0; j<13; j++)
			{
				eCardValue value = eCardValue.values()[j];
				Card c = new Card(suit, value);
				DeckCards.add(c);
			}
		}
		
		System.out.println("\n\t**DECK**");
		printDeck();
		
		shuffle();
		
		System.out.println("\n\tSHUFFLED DECK**");
		printDeck();
	}
	
	void printDeck() {
		for (int i=0; i < DeckCards.size(); i++)
		{
			System.out.println(DeckCards.get(i).getSuit() + "\t" + DeckCards.get(i).getRank());
		}
	}
	
	void shuffle() {
		Collections.shuffle(DeckCards);
	}
		
	public Card draw() {
		// return next card
		Card c = DeckCards.get(0);
		DeckCards.remove(c);
		return c;
	}
	
	public int NbrOfCards() {
		// how many cards remaining to be drawn
		return DeckCards.size();
	}

}
