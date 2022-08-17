package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {

	try {	
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter your numbers");
	   int a=scanner.nextInt();
	   int b=scanner.nextInt();
	   int c=a/b;
		System.out.println(c);
		scanner.close();
	    }
/*	catch(Exception e)
	{
		System.out.println("This is your error" + e);
	}
	*/             //Universal catch
	
	catch(ArithmeticException ar)
	{
		System.out.println("Can't Divide by zero " + ar);
	}
	catch(InputMismatchException im)
	{
		System.out.println("Please check input " + im);
	}
	
	finally
	{
		System.out.println("I execute every time");
	}
	}

}
