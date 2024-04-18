package blackjack;



public class Game {

	private int numDecks;
	private Deck deck;
	private User user;
	private Dealer dealer;
	
	public Game()
	{
		this.numDecks = 1;
		this.deck = new Deck();
		this.user = new User();
		this.dealer = new Dealer();
		
	}
	
	public Game(int numDecks) {
		this.numDecks = numDecks;
	}
	
	//Method to add/deal the first two cards to the user's and dealer's hands respectively
	public void deal() {
		user.addCard(deck.getCard(0));
		dealer.addCard(deck.getCard(1));
		user.addCard(deck.getCard(2));
		dealer.addCard(deck.getCard(3));
	}
	
	
	//String method to print the current situation of the game
	public String printGame() {
		String printGame = "";
		
		printGame += "Dealer Hand: " + "\n" + dealer.printHand();
		printGame += "Value: " + dealer.getHandValue() + "\n";
		
		printGame += "\n" + "User Hand: " + "\n" + user.printHand();
		printGame += "Value: " + user.getHandValue();
		return printGame;
	}
	
}
