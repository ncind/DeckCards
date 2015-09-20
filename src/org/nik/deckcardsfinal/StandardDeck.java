package org.nik.deckcardsfinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class StandardDeck implements Deck {

	private List<Card> entireDeck;
	
	
	// Constructor for Standard Deck : A Deck will have a list of cards
	public StandardDeck(){
		
		entireDeck = new ArrayList<Card>();
		for(Card.Rank r : Card.Rank.values())
		{
			for(Card.Suit s : Card.Suit.values())
			{
				entireDeck.add(new PlayingCard(r,s));
			}
		}
		
		
	}
	
	
	@Override
	public List<Card> getCards() {
		// TODO Auto-generated method stub
		return this.entireDeck;
	}

	@Override
	public Deck deckFactory() {
		return null;
	}

	@Override
	public int size() {
		return entireDeck.size();
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, Deck> deal(int players, int numberOfCards)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

}
