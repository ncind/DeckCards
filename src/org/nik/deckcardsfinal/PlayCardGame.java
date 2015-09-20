package org.nik.deckcardsfinal;

public class PlayCardGame {

	public static void main(String[] args)
	{
		DeckFactory dFactory = new DeckFactory();
		
		Deck playingDeck = null;
		
		playingDeck = dFactory.makeDeck("E");
		
		System.out.println(playingDeck.deckToString());
		
	}
	
}
