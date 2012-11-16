
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HoldEm poker = new HoldEm();
		Player Jim = new Player();
		Player James = new Player();
		Player Jimothy = new Player();
		
		poker.addPlayer(Jim);
		poker.addPlayer(James);
		poker.addPlayer(Jimothy);
		
		poker.shuffle();
		poker.printDeck();
		
		poker.deal();
		
		poker.showPlayersHand();
		
		poker.deal();
		poker.deal();
		poker.deal();
		poker.deal();
		

	}

}
