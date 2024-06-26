package blackjack;



public class Card {

	private String suit;
	private String rank;
	private int value;
	
	//Default Constructor
	public Card() {
		this.suit = null;
		this.rank = null;
	}
	
	//Constructor for cards
	public Card(String suit, String rank, int value)
	{
		this.suit = suit;
		this.rank = rank;
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}


	public void setSuit(String suit) {
		this.suit = suit;
	}


	public String getRank() {
		return rank;
	}


	public void setRank(String rank) {
		this.rank = rank;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}
	public String printCard() {
		String printStatement = "";
		
		printStatement += rank + " of " + suit;
		
		return printStatement;
	}
	
	
	
}
