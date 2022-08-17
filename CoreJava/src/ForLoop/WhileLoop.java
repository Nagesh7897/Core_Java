package ForLoop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int i, num1;
		System.out.println("Enter first number");
		num1=scanner.nextInt();
		
		i=1;       //initializing
		while (i<=10)    //condition
		{
			System.out.println(num1 + "*" + i + " =" + num1 * i);
			 i++ ;          //increment or decrement
		}
		scanner.close();
	}

}
