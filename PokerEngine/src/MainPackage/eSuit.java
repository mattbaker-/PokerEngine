package MainPackage;

public enum eSuit
{
	SPADE(0),
	HEART(1),
	DIAMOND(2),
	CLUB(3);
	
	private int suit;
	
	private eSuit(int s)
	{
		this.suit = s;
	}
	
	public int getValues() {
		return suit;
	}
}
