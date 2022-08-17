package ForLoop;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in) ;
			int i, num1, num2 ;
			System.out.println("Enter first number");
			num1=scanner.nextInt();
			System.out.println("Enter Second number");
			num2=scanner.nextInt();
			
			for(i=1; i<=10; i++)
			{
				System.out.print(num1 + "*" + i + " =" + num1 * i);
			
				System.out.println("   "+num2 + "*" + i + " =" + num2 * i);	
			}
			scanner.close();
		}
	
	}

