import java.util.Scanner;
public class TicTacToe

	{
		static String[][] board = new String[3][3];
		
		public static void main(String[] args)
			{
		FillBoard();
		board();

		
				
				
			}
		
		
		
		//=====================================================================================================================================================
		
		public static void FillBoard()
		{
		
		
			for(int row=0; row<board[].length; row++)
				{
					
				}
		}
		
		
		
		
		public static void board()
			{
				

								
			board[0][0]="";
			board[0][1]="";
			board[0][2]="";
			
			board[1][0]="";
			board[1][1]="";
			board[1][2]="";
			
			board[2][0]="";
			board[2][1]="";
			board[2][2]	="";
			
			System.out.println("+---+---+---+");
			System.out.println("| "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" |");
			System.out.println("+---+---+---+");	
			System.out.println("| "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" |");
			System.out.println("+---+---+---+");
			System.out.println("| "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" |");
			System.out.println("+---+---+---+");
			}
	}
