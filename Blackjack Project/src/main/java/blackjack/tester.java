package blackjack;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		//Deck deck = new Deck();
		//Card card = deck.getCard(0);
		
		Game game = new Game();
		game.deal();
		
		System.out.println(game.printGame());
		
		
		

	}

}
