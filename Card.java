public class Card
{
	private Suit suit;
	private int rank;
	
	public enum Suit {
	Club, Diamond, Heart, Spade
	}
	private String arrayrank[] = {"Ace","2","3","4","5","6","7","8","9","10","J","Q","K"};
	public Card(Suit s, int r)
	{
		suit = s;
		rank = r;
	}
	public void printCard() {
		System.out.println("(" + arrayrank[rank] + "," + suit + ")");

	}
	public Suit getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;

	}
}