package org.nik.deckcardsfinal;

public class DeckFactory {
	
	public DeckFactory(){
		
	}
	
	public Deck makeDeck(String deckType)
	{
		Deck resultDeck;
		if(deckType == "E")
		{
			resultDeck = new EuchreDeck();
		}
		else if(deckType == "S")
		{
			resultDeck = new StandardDeck();
		}
		else
		{
			resultDeck = null;
		}
		
		return resultDeck;
	}

}
