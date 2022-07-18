import java.util.Scanner;
import java.awt.event.*;  
import javax.swing.*;   


class createBoards{
	public static String turn="o";
	public String flip() {
		
		if(turn=="o") {
			turn="x";
			return turn;
		}
		else {return turn="o";}
		
	}
	
	public static int bs;
	createBoards(){
		//makes frame
		JFrame J=new JFrame("Tic-Tac-Toe-Game");
		J.setSize(400,400);  
		J.setLayout(null);  
		J.setVisible(true);
		
		//makes buttons
		JButton a=new JButton();  
		JButton b=new JButton();  
		JButton c=new JButton();  
		JButton d=new JButton();  
		JButton m=new JButton();  
		JButton f=new JButton();  
		JButton g=new JButton();  
		JButton h=new JButton();  
		JButton i=new JButton();  
		
		//sets button locations and adds it to JFrame and adds listeners to each
		a.setBounds(150,100,50,50);
		a.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				a.setText(flip());
			}});  
			J.add(a);
		
		b.setBounds(100,100,50,50);
		b.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				b.setText(flip());
			}});  
		J.add(b);
		
		c.setBounds(50,100,50,50);
		c.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				c.setText(flip());
			}});  
		J.add(c);
		
		d.setBounds(150,150,50,50);
		d.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				d.setText(flip());
			}});  
		J.add(d);
		
		m.setBounds(100,150,50,50);
		m.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				m.setText(flip());
			}});  
		J.add(m);
		
		f.setBounds(50,150,50,50);
		f.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				f.setText(flip());
			}});  
		J.add(f);
		
		g.setBounds(150,200,50,50);
		g.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				g.setText(flip());	
			}});  
		J.add(g);
		
		h.setBounds(100,200,50,50);
		h.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				h.setText(flip());
			}});  
		J.add(h);
		
		i.setBounds(50,200,50,50);
		i.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				i.setText(flip());	
			}});  
		J.add(i);

		

	}
}



class Board {
		public static String turn="o";
		static String row1[]= {".","|",".","|","."};
		String row2[]= {"-----"};
		static String row3[]= {".","|",".","|","."};
		String row4[]= {"-----"};
		static String row5[]=  {".","|",".","|","."};
		
		public void printBoard() {
		
			for(int i=0; i<=4; i++ ) {
				
				System.out.print(row1[i]);
			}	
			System.out.println();	
			System.out.print(row2[0]);				
			System.out.println();
			
			for(int i=0; i<=4; i++ ) {
				
				System.out.print(row3[i]);
			}	
			System.out.println();
			System.out.print(row2[0]);
			
			System.out.println();
		
			for(int i=0; i<=4; i++ ) {
				
				System.out.print(row5[i]);
			}	
			System.out.println();
		}
		
		public static String boardChecker(Board board){
			
			//checks x being the winner
			String x="x";
			String t=".";
			
			
			//checks rows
			if(row1[0]==x && row1[2]==x && row1[4] == x) {				
				return x;				
			}
			if(row3[0]==x && row3[2]==x && row3[4] == x) {				
				return x;				
			}
			if(row5[0]==x && row5[2]==x && row5[4] == x) {				
				return x;				
			}
			
			
			//checks columns
			if(row1[0]==x && row3[0]==x && row5[0] == x) {				
				return x;				
			}
			if(row1[2]==x && row3[2]==x && row5[2] == x) {				
				return x;				
			}
			if(row1[4]==x && row3[4]==x && row5[4] == x) {				
				return x;				
			}
			
			//checks diagonals
			if(row1[0]==x && row3[2]==x && row5[4] == x) {				
				return x;				
			}
			if(row1[4]==x && row3[2]==x && row5[0] == x) {				
				return x;				
			}
			
			
			//checks for o being the winner
			x="o";
			
			//checks rows
			if(row1[0]==x && row1[2]==x && row1[4] == x) {				
				return x;				
			}
			if(row3[0]==x && row3[2]==x && row3[4] == x) {				
				return x;				
			}
			if(row5[0]==x && row5[2]==x && row5[4] == x) {				
				return x;				
			}
			
			
			//checks columns
			if(row1[0]==x && row3[0]==x && row5[0] == x) {				
				return x;				
			}
			if(row1[2]==x && row3[2]==x && row5[2] == x) {				
				return x;				
			}
			if(row1[4]==x && row3[4]==x && row5[4] == x) {				
				return x;				
			}
			
			//checks diagonals
			if(row1[0]==x && row3[2]==x && row5[4] == x) {				
				return x;				
			}
			if(row1[4]==x && row3[2]==x && row5[0] == x) {				
				return x;				
			}
			
			//checks for stalemate
			if(row1[0]!=t && row1[2]!=t && row1[4] != t && row3[0]!=t && row3[2]!=t && row3[4] != t && row5[0]!=t && row5[2]!=t && row5[4] != t ) {
				return "Stalemate";
			}
	
			else {return ".";}
			
		}
		
		public String flip() {
			
			if(turn=="o") {
				turn="x";
				return turn;
			}
			else {return turn="o";}
			
		}
		
		public void playGame(Board a){
			
			String check =Board.boardChecker(a);
			Scanner in = new Scanner(System.in);
			while(check ==".") {
        System.out.println("To enter location type the row first then column ei: 11 will place it in the first row and first column or 22 will place it in the second row and second column.");
				System.out.println("Where do you want to go?");
				printBoard();
				flip();
				int input = in.nextInt();
				
				if(input==11) {Board.row1[0]=turn;}
				if(input==12) {Board.row1[2]=turn;}
				if(input==13) {Board.row1[4]=turn;}
				if(input==21) {Board.row3[0]=turn;}
				if(input==22) {Board.row3[2]=turn;}
				if(input==23) {Board.row3[4]=turn;}
				if(input==31) {Board.row5[0]=turn;}
				if(input==32) {Board.row5[2]=turn;}
				if(input==33) {Board.row5[4]=turn;}
				
				check =Board.boardChecker(a);
				
			}
			
			if(check=="x") {
				System.out.println("X wins!");
			}
			if (check=="o") {
				System.out.println("O wins!");	
			}
			if(check=="Stalemate") {
				System.out.println("Its a stalemate!");
			}
			
			in.close();
		}		
		
		Board(){
			
			printBoard();			
		}
	}



public class Main {
	
	public static void main(String[] args) {
		
		createBoards j= new createBoards();
		Board board =new Board();
		board.playGame(board);
		
		
	
	}

	

	
	
}





