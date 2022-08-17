package ArrayConcept;

import java.util.Scanner;

public class Searchinarray {

	public static void main(String[] args) {
	
		int a[] =new int[5];
		boolean flag=false;
		int position= 0;
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please Enter 5 elements");
		
		for(int i=0; i<5; i++)
		{
			a[i]= scanner.nextInt();
		}
		
		int item;
		System.out.println("Enter Element To Found");
		item=scanner.nextInt();
			
		for (int i=0;i<5;i++)
		{
			if (item==a[i])
		{
			flag=true;
			position=i;
			break;
		}
		}
		if(flag==true)
		{
		System.out.println("Element found at position"+ (position+1));
		}
	
		else
		{
		System.out.println("Item not found");	
		}
	scanner.close();
}
}