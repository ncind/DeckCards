package org.nik.deckcardsfinal;

public interface Card extends Comparable<Card>{
	
	public enum Suit {
		DIAMONDS(1, "Diamonds"),
		CLUBS(2, "Clubs"),
		SPADES(3, "Spades"),
		HEARTS(4, "Hearts");
		
		private int value;
		private String text;
		Suit(int value, String text){
			this.value = value;
			this.text = text;
		}
		
		public int value(){
			return this.value;
		}
		
		public String text(){
			return this.text;
		}
		
	}
	
	public enum Rank {
		DEUCE(2, "Two"),
		THREE(3, "Three"),
		FOUR(4, "Four"),
		FIVE(5, "Five"),
		SIX(6, "Six"),
		SEVEN(7, "Seven"),
		EIGHT(8, "Eight"),
		NINE(9, "Nine"),
		TEN(10, "Ten"),
		JACK(11, "Jack"),
		QUEEN(12, "Queen"),
		KING(13, "King"),
		ACE(14, "Ace");
		
		private int value;
		private String text;
		
		Rank(int value, String text)
		{
			this.value = value;
			this.text = text;
		}
		
		public int value()
		{
			return this.value;
			
		}
		
		public String text()
		{
			return this.text;
		}
		
	}
	
	public Card.Rank getRank();
	
	public Card.Suit getSuit();
	
	

}
