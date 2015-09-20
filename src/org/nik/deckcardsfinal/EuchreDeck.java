package org.nik.deckcardsfinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.nik.deckcardsfinal.Card.*;

public class EuchreDeck implements Deck {

	private List<Card> entireDeck;
	
	
	
	
	// Public Constructor for the Euchre Deck
	public EuchreDeck()
	{
		entireDeck = new ArrayList<Card>();
		for(Card.Suit s : Suit.values())
		{
			for(int i = Rank.NINE.value(); i <= Rank.ACE.value(); i++ )
			{
				//entireDeck.add(new PlayingCard(Rank, s));
			}
		}
		
	}
	
	
	@Override
	public List<Card> getCards() {
			return this.entireDeck;
	}

	@Override
	public Deck deckFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return this.entireDeck.size();
	}

	@Override
	public void addCard(Card card) {
		this.entireDeck.add(card);

	}

	@Override
	public void addCards(List<Card> cards) {
		this.entireDeck.addAll(cards);
	}

	@Override
	public void addDeck(Deck deck) {
		List<Card> tempDeck = deck.getCards();
		this.entireDeck.addAll(tempDeck);

	}

	@Override
	public void shuffle() {
		Collections.shuffle(this.entireDeck);

	}

	@Override
	public void sort() {
		Collections.sort(this.entireDeck);

	}

	@Override
	public void sort(Comparator<Card> c) {
		// TODO Auto-generated method stub

	}

	@Override
	public String deckToString() {
		String stringToReturn = "";
		for(Card r : this.entireDeck)
		{
			stringToReturn += " ";
			stringToReturn += r.toString();
		}
		return stringToReturn;
	}

	@Override
	public Map<Integer, Deck> deal(int players, int numberOfCards)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

}
