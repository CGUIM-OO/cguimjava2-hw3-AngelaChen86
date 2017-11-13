

import java.util.*;

public class deck {

	private ArrayList<Card> cards;
	private ArrayList<Card> usedCard;
	public int nUsed = -1;
	public deck(int nDeck) {
		cards = new ArrayList<Card>();
		usedCard =new ArrayList<Card>();
		for (int i = 1; i <= nDeck; i++) 
		{
			for (Card.Suit suit : Card.Suit.values()) 
			{
				for (int rank = 1; rank <= 13; rank++)
				{
					Card card = new Card(suit, rank);
					cards.add(card);
				}
			}
		}
	}

	public void printDeck() {
		for(Card a:cards)
		{
			a.printCard();
		}
	}
	public Card getOneCard() {
		nUsed = nUsed + 1;
		if(nUsed == 52)
		{
			usedCard.clear();
			shuffle();
		}
		usedCard.add(cards.get(nUsed));
		return cards.get(nUsed);
	}

	public void shuffle() {
		ArrayList<Card> NewCard = new ArrayList<Card>();
		Random rnd = new Random();
		Card c;
		for (int i = 1; i <= 52; i++) 
		{
			do 
			{
				c = cards.get(rnd.nextInt(52));
			} 
			while (NewCard.contains(c));
			NewCard.add(c);
		}
		cards.clear();
		cards = NewCard;
		nUsed = 0;
	}

	public ArrayList<Card> getAllCards() {
		return cards;
	}
}