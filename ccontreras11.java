// Christian A. Contreras
// LAB11
// 11/14/23

import java.util.Scanner;

public class ccontreras11
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int userInput = keyboard.nextInt();

		System.out.printf("Your number squared is %d\n", userInput*userInput);
	}
}
