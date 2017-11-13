import java.util.Random;

public class deck {

	public static void main(String[] args) {
				//TODO: please add new fields and methods to Deck class (35)
				//usedCard (5 points)
				//nUsed (5 points)
				//getOneCard (10 points)
				//shuffle (10 points)
				//constructor (5 points)
				deck deck=new deck(nDeck);
				//Card newCard=deck.getOneCard();
				}
	
	static void shuffle(Object suit,Object rank) {
		// TODO Auto-generated method stub
				Random rnd = new Random();
				int j = rnd.nextInt(suit - 1);
	}
	
	public static Card getOneCard() {
		int suit = 4;
		int value = 13;
		Card.printCard();
		if(value <= 1 && suit <= 1)
		{
			shuffle(suit,rank);
		}
	}
	
	public static Object getAllCards() {
		
		
	}
	static void Constructor (int suit, int rank) {
		for (suit = 4;suit <= 1;suit--){
			for(rank = 13;rank <= 1;rank--)
			{
				System.out.println(suit+","+rank);
			}
		}
	}
}
