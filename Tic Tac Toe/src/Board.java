
public class Board
	{
		
		public static String[][] board = new String[3][3];
		
		public static void fillBoard()
			{
			
			
				for(int row=0; row < board.length; row++)
					{
						for(int col=0; col < board[row].length; col++)
							{
								board[row][col]=" ";
							}
					}
			//	System.out.println("Fill test");
			}
		
			public static void displayBoard()
				{
					

									
			
				System.out.println("    A   B   C  ");
				System.out.println("  +---+---+---+");
				System.out.println("1 | "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" |");
				System.out.println("  +---+---+---+");	
				System.out.println("2 | "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" |");
				System.out.println("  +---+---+---+");
				System.out.println("3 | "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" |");
				System.out.println("  +---+---+---+");
			}
	}
