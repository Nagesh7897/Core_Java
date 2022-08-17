package ArrayConcept;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		int a[]= new int[5];
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter All Numbers");
		for(int i=0; i<=4; i++)
		{	
		a[i]= scanner.nextInt();
		}
		
		for(int i=0; i<=4; i++)
		{
			System.out.println("Element at position " + i+" is=" +a[i]);
		}
	scanner.close();
}
}