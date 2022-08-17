package userinput;

import java.util.Scanner;

public class FactorialCalculation {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter your numbers");
		int num=scanner.nextInt();
		int fact=1;
		
		for(int i=1; i<=num; i++)
		{	
		fact=fact*i;
		}
		System.out.println(fact);
		scanner.close();
	}

}
