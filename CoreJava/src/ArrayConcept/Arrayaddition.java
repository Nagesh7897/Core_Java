package ArrayConcept;

import java.util.Scanner;

public class Arrayaddition {

	public static void main(String[] args) {
		
		int a[]= new int[5];
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter All Numbers");
		int Sum=0;
		for(int i=0; i<=4; i++)
		{		
		a[i]= scanner.nextInt();       //input
		}
		
		for(int i=0; i<=4; i++)
		{
			Sum = Sum + a[i];   //operations
		}
	
	System.out.println("Addition of Numbers are "+ Sum);    //output
	
	scanner.close();
}
}
