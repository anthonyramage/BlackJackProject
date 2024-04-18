package blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private static ArrayList<Card> deck = new ArrayList<Card>();
	private String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	private String[] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	private int[] value = {2,3,4,5,6,7,8,9,10,10,10,10,11};
	
	//ArrayList to store the cards that are discarded from the deck
	private ArrayList<Card> discard = new ArrayList<Card>();
	
	
	//Initializes each card and adds it to the deck
	public Deck()
	{
		for (int s = 0; s < 4; s++) {
			for( int i = 0; i < 13; i++) {
				Card card = new Card(suits[s],rank[i],value[i]);
				deck.add(card);
			}
		}
		//shuffles the deck
		Deck.doShuffle();
	}
	
	
	//Internal static shuffle method
	static void doShuffle()
	{
		Collections.shuffle(deck);
		
	}
	
	//Method to retrieve a card in the deck at a given index
	//Used by the deal method in the Game class
	public Card getCard(int index) {
		Card requestedCard = new Card();
		
		requestedCard = deck.get(index);
		
		
		return requestedCard;
	}
	
	
	
	//Prints every card out that is in the deck
	public String printDeck() {
		String printDeck ="";
		
		for(int i = 0; i < deck.size(); i++)
		{
			printDeck += deck.get(i).printCard();
			printDeck += "\n";
		}
		
		return printDeck;
	}
	
	
}
