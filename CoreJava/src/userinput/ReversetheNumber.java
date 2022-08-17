package userinput;

import java.util.Scanner;

public class ReversetheNumber {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter your numbers");
		int num=scanner.nextInt();
		int rev=0, rem;
		while(num>0)
		{
			rem=num%10;             	//	System.out.println("rem="+rem);
			rev=rev*10+rem;           	//	System.out.println("Reve"+rev);
			num=num/10;               	//	System.out.println(num);
		}
			System.out.println(rev);
			scanner.close();
	}

}
