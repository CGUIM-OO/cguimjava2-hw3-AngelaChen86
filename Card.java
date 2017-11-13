import java.util.Random;

public class Card {
	private static int value;
	private static int suit;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TODO: please check your output, make sure that you print newCard and newCard2 on your screen  (10 points)
		//TODO: please add new fields and methods to Card class (25)
		//Use enumerated type in Card (10 points)
		//Constructor (5 points)
		//printCard (5 points)
		//getSuit (5 points)
		Object suit;
		Object rank;
		printCard();
		Card newCard=deck.getOneCard();
		newCard.printCard();
		Card newCard2=deck.getOneCard();
		newCard2.printCard();
		deck.shuffle(suit,rank);
		if(isAllCardsCorrect(deck.getAllCards(),nDeck))
		{
			if(!isShuffleWorking(deck,newCard,newCard2))
			{
				System.out.println("All Card: Well done! But shufller is not working");
			}
			else
			{
				System.out.println("Well done!");
			}		
		}
		else
		{
			System.out.println("All Card: Error, please check your sourse code");
		}
}		
	
	private static void printCard() {
		deck.Constructor(suit,rank);
	}
	private static void getSuit() {
		int suit;
	}

	private static void getRank() {
		int rank;
	}
}

