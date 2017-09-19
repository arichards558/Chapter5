package delgados;
import java.util.Scanner;

public class DelgadosTacosChoice {

	public static void main(String[] args) 
	{
		int choice1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please choose a 1 for taco or 2 for burrito>>>");
		choice1 = input.nextInt();
		
		if(choice1 == 1) 
		{
			System.out.println("You chose a burrito");
		}
		if(choice1 == 2)
		{
			System.out.println("You chose a taco");
		}
		if(choice1 > 3 & choice1 < 999)
		{
			System.out.println("I said one or two you trash can not " + choice1 );
		}
		if (choice1 > 1000 & choice1 < 9999)
		{
			System.out.println("User you are an idiot. This is way off from 1 or 2");
		}
		if (choice1 <  2147 * 7)
		{
			System.out.println("We do not accept numbers that high. It is too big of an integer to accept and understand");
		}


	}

}
