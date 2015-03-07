package MainPackage;

public class Play {

	public static void main(String[] args)
	{
		// BUILD A DECK
		
		Deck myDeck = new Deck();
		System.out.println("\nCards in deck: " + myDeck.NbrOfCards());
		
		
		// DRAW A HAND(S)
		
		Hand myHand2 = new Hand(myDeck, 5);
		System.out.println("\nCards in deck: " + myDeck.NbrOfCards());
//		myDeck.printDeck();
		
		Hand myHand3 = new Hand(myDeck, 5);
		System.out.println("\nCards in deck: " + myDeck.NbrOfCards());
//		myDeck.printDeck();
		
		
		// EVALUATE THE HANDS
		
		
	}

}
