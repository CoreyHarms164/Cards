
public class GraphicCard {
	
	
	
	public static void main(String[] args) {
		
		CardStack c = new CardStack();
		Deck d = new Deck();
		d.printDeck();
		c.insert(d.dealTopCard());
		Card cc = new Card();
		cc = c.showTopCard();
		System.out.println(cc);
		
	
	
	
	
	
	
	
	}

}
