package MainPackage;

import java.util.Arrays;
import java.util.Collections;

public class Hand {
	
	Card[] Card;
	
	public Hand(Deck d, int nbrOfCards)
	{
		this.Card = new Card[nbrOfCards];
		
		for (int i=0; i < nbrOfCards; i++) {
			Card[i] = d.draw();
		}
		
		System.out.println("\n\t**DEALT HAND**");
		printHand();
		
		Collections.sort(Card);
		
		System.out.println("\t**SORTED HAND**");
		printHand();
	}
	
	void printHand() {
		for (int i=0; i < Card.length; i++) {
			System.out.println(Card[i].getRank() + " of " + Card[i].getSuit());
		}
	}
	
	void sort() {
		Card[] sorted = new Card[Card.length];
		for (int i=0; i < Card.length; i++)
		{
			//
		}
	}
	
	public static void evaluate() {
		//
	}
}
