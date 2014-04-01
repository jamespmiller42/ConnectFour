/* 
 * runGame is a class containing the main method, which will be used 
 * to actually run the game of connect four.
 * 
 */

import java.io.*;

public class runGame {

	public static void main(String args[]) throws Exception
	{
		Board b; playerSearch p,k;
		b=new Board(7,6);
		p=new playerSearch();
		k=new playerSearch();
		
		//Creates a BufferedReader object so that the user can interact with the game.
		BufferedReader move = new BufferedReader(new 
				InputStreamReader(System.in));

		//While loop uses winnerIs() and validMoves() functions from Board.java to determine whether
		//The game is done
		while((b.winnerIs()==0) && b.validMovesLeft())
		{
			if(b.cp == b.PLAYER_ONE)
				//Make player one's move
				b.makeMove(Integer.parseInt(move.readLine()));
			else
				//Make player two's move
				b.makeMove(p.getMove(b));
			//Print the board to the terminal
			System.out.println(b);
			
			//Arbitrary print statement to test git push
			System.out.println(); 
		}
		

	}
}




