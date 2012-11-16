import java.awt.*;
import javax.swing.*;

public class ShowCards extends JFrame{
	
	Deck d;
	JPanel p1, p2;
	String card1, card2, card3, card4;
	CardStack topLeft, topRight, bottomLeft, bottomRight;
	
	
	
	public ShowCards(){
	
		setLayout(new GridLayout(2, 2, 5, 5));
	
		ImageIcon cardBack = new ImageIcon("CardBack.png");
		JLabel lblBack = new JLabel(cardBack);
		

}
	
	
	
	
	public static void main(String[] args) {
		
		Deck d = new Deck();
		d.shuffle();
		
		
		String s1 = d.dealTopCard().toString();
		String s2 = d.dealTopCard().toString();
		String s3 = d.dealTopCard().toString();
		String s4 = d.dealTopCard().toString();
		
		ImageIcon c1 = new ImageIcon(s1 + ".png");
		ImageIcon c2 = new ImageIcon(s2 + ".png");
		ImageIcon c3 = new ImageIcon(s3 + ".png");
		ImageIcon c4 = new ImageIcon(s4 + ".png");
		JLabel l1 = new JLabel(c1);
		JLabel l2 = new JLabel(c2);
		JLabel l3 = new JLabel(c3);
		JLabel l4 = new JLabel(c4);
		
		ShowCards show = new ShowCards();
		show.setTitle("These cards");
		show.setSize(400, 400);
		show.setLocationRelativeTo(null);
		show.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		show.setVisible(true);
		show.add(l1);
		show.add(l2);
		show.add(l3);
		show.add(l4);
		
		
		

	}

}
