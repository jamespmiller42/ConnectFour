/* 
 * runGame is a class containing the main method, which will be used 
 * to actually run the game of connect four.
 * 
 */

import java.io.*;

public class runGame {

	public static void main(String args[]) throws Exception
	{
		Board b; playerSearch p;
		b=new Board(7,6);
		p=new playerSearch();
		
		//Creates a BufferedReader object so that the user can interact with the game.
		BufferedReader move = new BufferedReader(new 
				InputStreamReader(System.in));

		//Welcome Message
		System.out.println("Welcome to ConnectFour! Here is your game board:");
		System.out.println(b);
			
		//While loop uses winnerIs() and validMoves() functions from Board.java to determine whether
		//The game is done
		while((b.winnerIs()==0) && b.validMovesLeft())
		{
			if(b.cp == b.PLAYER_ONE) {
				//Prompt player 1 for move and make move
				System.out.println("Player 1, enter a column number from 0-6 inclusive to drop your counter:");
				b.makeMove(Integer.parseInt(move.readLine()));
			}	else  {
				//Make player two's move
				b.makeMove(p.getMove(b));
			}
			//Print the board to the terminal
			System.out.println(b);
			
		}
		
		//Tells the user how the game has finished.
		if(b.winnerIs() == 1) {
			System.out.println("Player 1 WINS!");
		} else if(b.winnerIs()==-1) {
			System.out.println("Player 2 WINS!");
		} else if(b.validMovesLeft() == false) {
			System.out.println("No valid moves remaining!");
		}
	
		

	}
}




