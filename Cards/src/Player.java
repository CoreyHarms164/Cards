
public class Player {
	
	String name;
	Card[] cards = new Card[2];
	
	public Player(){
		
	}
	
	public Player(String n){
		name = n;
	}
	
	public void fold(){
		cards[0] = null;
		cards[1] = null;
	}
	
	public void getCard(int i, Card c){
		cards[i] = c;
	}
	
	public String toString(){
		return cards[0].toString() + " " + cards[1].toString();
	}

}
