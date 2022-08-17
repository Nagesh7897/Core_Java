package ArrayConcept;

import java.util.Scanner;

public class MultiplicationOfArray {

	public static void main(String[] args) {
		int a[]= new int[4];
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter All Numbers");
		int Mult=1;
		for(int i=0; i<4; i++)
		{		
		a[i]= scanner.nextInt();       //input
		}
		
		for(int i=0; i<4; i++)
		{
			Mult = Mult * a[i];    //operations
		}
	
	System.out.println("Multiplication of Numbers are "+ Mult);   //output
	
	scanner.close();

	}

}
