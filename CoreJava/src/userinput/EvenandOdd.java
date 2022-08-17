package userinput;

import java.util.Scanner;

public class EvenandOdd {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num=scanner.nextInt();
		
		if (num<0)
		{
			System.out.println("Number is Negative");
		}
		else if (num==0)
		{
			System.out.println("Number is Zero");
		}
		else if(num%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
		scanner.close();
	}

}
