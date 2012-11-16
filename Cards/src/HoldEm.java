
public class HoldEm extends Deck{
	
	Card[] board = new Card[5];
	Player[] players = new Player[10];
	int nextPlayer;
	int nextDeal;
	
	public HoldEm(){
		nextPlayer = 0;
		nextDeal = 1;
		
	}
	
	public void addPlayer(Player p){
		players[nextPlayer] = p;
		nextPlayer ++;
	}
	
	public void deal(){
		switch (nextDeal){
		case 1: //The Deal
			System.out.println();
			System.out.println("Dealer deals to players");
			System.out.println();
			for(int i = 0; i <= 1; i ++){
				int dealTo = 0;
				while(players[dealTo] != null){
					players[dealTo].getCard(i, this.dealTopCard());
					dealTo ++;
				}
			}
			nextDeal ++;
			break;
		case 2: //The Flop
			System.out.println();
			Card burn = this.dealTopCard();
			for(int i = 0; i <= 2; i++)
				board[i] = this.dealTopCard();
			
			System.out.println("The Board:");
			System.out.println();
			this.showBoard();
			
			nextDeal ++;
			break;
			
		case 3: //The Turn
			burn = this.dealTopCard();
			board [3] = this.dealTopCard();
			System.out.println(board[3]);
			nextDeal ++;
			break;
		case 4: //The River
			burn = this.dealTopCard();
			board[4] = this.dealTopCard();
			System.out.println(board[4]);
			nextDeal ++;
			break;
			
		case 5: //reset
			int k = 0;
			while(players[k] != null){
				players[k].fold();
				k++;
				
			}
			this.shuffle();
		break;
		}
	}
	
	public void showPlayersHand(){
		int i = 0;
		while(players[i] != null){
			System.out.println(players[i]);
			i ++;
		}
	}
	
	private void showBoard(){
		int i = 0;
		while(board[i] != null){
			System.out.println(board[i]);
			i ++;
		}
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
