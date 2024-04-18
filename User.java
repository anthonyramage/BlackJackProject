package blackjack;

import java.util.*;

public class User {
	
	
	private int handValue;
	private ArrayList<Card> hand = new ArrayList<Card>();
	
	public User() {
		handValue = 0;
	}
	
	//Adds card to the users hand and increases handValue
	public void addCard(Card newCard) {
		hand.add(newCard);
		handValue += newCard.getValue();
	}
	
	
	//Returns the handValue - this method sums the value of each card in the ArrayList "hand"
	public int getHandValue() {
		this.handValue = 0;
		for(int i = 0; i < hand.size(); i++)
		{
			Card tempCard = hand.get(i);
			handValue += tempCard.getValue();
		}
		
		return handValue;
	}
	

	//Sets the hand Value - could be used for Aces later?
	public void setHandValue(int handValue) {
		this.handValue = handValue;
	}

	//Prints out the users hand in a string
	public String printHand() {
		String printHand = "";
		
		for(int i = 0; i < hand.size(); i++) {
			printHand += hand.get(i).printCard() + ", ";
			
		}
		
		return printHand;
	}
	
}
