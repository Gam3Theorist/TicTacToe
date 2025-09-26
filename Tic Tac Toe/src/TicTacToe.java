import java.util.Scanner;
public class TicTacToe

	{
	static String[][] board = new String[3][3];
	static Scanner userInput = new Scanner(System.in);
	static String choice= userInput.next();
		
		public static void main(String[] args)
			{
				System.out.println("Welcome to TicTacToe! \n Beat the computer \n+---+---+---+---+ \nAnswer number, then letter (Example: 1A)  ");
				
		CoinFlip();
		FillBoard();
		displayBoard();

		
				
				
			}
		
		
		
		//=====================================================================================================================================================
		
		public static void CoinFlip()
		{
			int coin = ((int)(Math.random()*2)+1);
			//System.out.println(coin);
		}
		
		public static void Choice()
		{
			
			
		}
		
		public static void FillBoard()
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
	
		public static void userPlay()
		{
			
			boolean valid=false;
			
			System.out.println("You're turn!");
			
			while(valid==false)
				{
					
					String choiceArray[] = choice.split("");
					
					if(choiceArray[0].equals("1"))
						{
							if(choiceArray[1].equals("A"))
								{
									board[0][0]="X";
								}
							else if(choiceArray[1].equals("B"))
								{
									board[0][1]="X";
								}
							else if(choiceArray[1].equals("C"))
								{
									board[0][2]="X";
								}
						}
					else if (choiceArray[0].equals("2"))
						{
							if(choiceArray[1].equals("A"))
								{
									board[1][0]="X";
								}
							else if(choiceArray[1].equals("B"))
								{
									board[1][1]="X";
								}
							else if(choiceArray[1].equals("C"))
								{
									board[1][2]="X";
								}
						}
					else if (choiceArray[0].equals("3"))
						{
							if(choiceArray[1].equals("A"))
								{
									board[2][0]="X";
								}
							else if(choiceArray[1].equals("B"))
								{
									board[2][1]="X";
								}
							else if(choiceArray[1].equals("C"))
								{
									board[2][2]="X";
								}
						}
				
					
					
				}
			
		}
		
		
		
	}
