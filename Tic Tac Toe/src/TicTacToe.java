import java.util.Scanner;
public class TicTacToe

	{
	
	
		
		public static void main(String[] args)
			{
				System.out.println("Welcome to TicTacToe! \n Beat the computer \n+---+---+---+---+ \nAnswer number, then letter (Example: 1A)  ");
				
	//	flipCoin();
		Board.fillBoard();
		Board.displayBoard();
		Plays.userPlayX();
		
				
				
			}
		
		
		
		//=====================================================================================================================================================
		
		public static void flipCoin()
		{
			int coin = ((int)(Math.random()*2)+1);
			//System.out.println(coin);
		}
		
	
		
	
		
		
		
	}
