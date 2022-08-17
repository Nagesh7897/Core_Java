package Numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=scanner.nextInt();
		int flag=0;
		int count=0;
		for(int i=2;i<num/2;i++)
		{
		count++;
			if (num%i==0)
			{
				flag=1;
				break;	
			}
		}
		if(flag==1)
		{
			System.out.println("Not Prime");
		}
		else
		{
			System.out.println("Prime Number");
		}
		System.out.println("Loop run Count "+count);   //Extra 
		scanner.close();
	}

}
