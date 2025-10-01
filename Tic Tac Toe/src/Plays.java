import java.util.Scanner;



public class Plays
	{
		static Scanner userInput = new Scanner(System.in);
		static String choice; //= userInput.next();
		static int x;
		static int y;
		
		public static void userPlayX()
			{
				
				boolean validWord=false;
				while(validWord==false)
					{
						System.out.println( " \n Your turn!");
						 choice = userInput.next().toUpperCase().replace(" ", "");
						 
						validWord=true;
						
						if	   (choice.equals("A1"))
							{
								x=0;
								y=0;
							}
						else if(choice.equals("A2"))
							{
								x=1;
								y=0;
							}
						else if(choice.equals("A3"))
							{
								x=2;
								y=0;
							}
						
						else if(choice.equals("B1"))
							{
								x=0;
								y=1;
							}
						else if(choice.equals("B2"))
							{
								x=1;
								y=1;
							}
						else if(choice.equals("B3"))
							{
								x=2;
								y=1;
							}
						else if(choice.equals("C1"))
							{
								x=0;
								y=2;
							}
						else if(choice.equals("C2"))
							{
								x=1;
								y=2;
							}
						else if(choice.equals("C3"))
							{
								x=2;
								y=2;
							}
						
						else
							{
								System.out.println("Not an option! Remember, (letter,number)");
								validWord=false;
							}
						
					} //  <---while
				
			System.out.println("lol");
			}
			
	}
