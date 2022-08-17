package userinput;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter your numbers");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=a+b;
		System.out.println(c);
		scanner.close();
	}

}
