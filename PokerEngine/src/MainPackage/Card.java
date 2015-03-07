package MainPackage;

import java.util.Collections;

public class Card implements Comparable<Card>
{
	private eSuit suit;
	private eCardValue rank;
	
	private Card()
	{
		//
	}
	
	public Card(eSuit suit, eCardValue rank)
	{
		this.suit = suit;
		this.rank = rank;
	}
	
	eSuit getSuit() {
		return suit;
	}
	
	eCardValue getRank() {
		return rank;
	}
	
	public int compareTo(Card c){
		if (this.rank.getValues() > c.rank.getValues()){
			return rank.getValues();
		}
		else {
			return c.rank.getValues();
		}
	}
}
