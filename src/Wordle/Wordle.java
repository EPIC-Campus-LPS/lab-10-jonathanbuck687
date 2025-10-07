package Wordle;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Wordle {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		String[] conspiring = new String[5];
		String[] maltodexring = new String[5];
		File file = new File("Wordle.txt");
		Scanner sc = new Scanner(file);
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Wordle/n");
		System.out.println("In this game you will guess a secret 5 letter word. Each turn you will guess a 5 letter word and I will tell you if a letter is correct and in the correct location with a \"*\", if a letter is correct but in the wrong location with a \"!\", and if a letter is incorrect with a \"?\". ");
		while(sc.hasNextLine())
		{
			String answer = sc.nextLine();
			for (int u = 0; u < 5; u++)
			{
				conspiring[u] = " _ ";
			}
			for (int k = 0; k < 5; k++)
			{
				maltodexring[k] = " _ ";
			}
			for (int i = 0; i < 6; i++)
			{
				System.out.println("\nGuess the secret word: ");
				for (int h = 0; h < maltodexring.length; h++)
				{
					System.out.print(maltodexring[h]);
				}
				System.out.println("");
				System.out.println("Your guess: ");	
				String guess = scan.nextLine();
				
				

				for (int j = 0; j < 5; j++)
				{
					if (guess.substring(j, j + 1).equals(answer.substring(j, j + 1)))
					{
						conspiring[j] = " * ";
						maltodexring[j] = (" " + answer.substring(j, j + 1) + " ");
					}
					else if (guess.substring(j, j + 1).equals(answer.substring(0, 1)))
					{
						conspiring[0] = " ! ";
					}
					else if (guess.substring(j, j + 1).equals(answer.substring(1, 2)))
					{
						conspiring[1] = " ! ";
					}
					else if (guess.substring(j, j + 1).equals(answer.substring(2, 3)))
					{
						conspiring[2] = " ! ";
					}
					else if (guess.substring(j, j + 1).equals(answer.substring(3, 4)))
					{
						conspiring[3] = " ! ";
					}
					else if (guess.substring(j, j + 1).equals(answer.substring(4, 5)))
					{
						conspiring[4] = " ! ";
					}
				}
				for (int t = 0; t < conspiring.length; t++)
				{
					System.out.print(conspiring[t]);
				}
				if (guess.equals(answer))
				{
					System.out.println("\nCorrect!");
					break;
				}
				for (int u = 0; u < 5; u++)
				{
					conspiring[u] = " _ ";
				}
			}
			
		}
	}

}
