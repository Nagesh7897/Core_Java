package exceptionHandling;

import java.util.Scanner;

public class Reinitializing {

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
	      catch(Exception e)    //Universal catch
			{
				System.out.println("This is your error" + e);
				Reinitializing.main(args);
			}
	}

}
