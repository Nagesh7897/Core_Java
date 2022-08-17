package array2D;

import java.util.Scanner;

public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= new int[2][3];                    // 1st- rows and 2nd- columns
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter All Numbers");
		for(int i=0; i<2; i++)
		{	
			for(int j=0; j<3; j++) 
			{
				a[i][j]= scanner.nextInt();
			}
		}
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++) 
			{
			System.out.println("Element at position " + i+j+" is=" +a[i][j]);
			}
		}
	scanner.close();
	}

}
