package userinput;

import java.util.Scanner;

public class greaterNumber {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		if (a==b)
		{
			System.out.println("Both numbers are same");
		}
		
		else if (a>b)
		{
			System.out.println(a + " is Greater than " + b);
		}
		
		else
		{
			System.out.println(b + " is Greater than " + a);
		}
		scanner.close();
	}

}
