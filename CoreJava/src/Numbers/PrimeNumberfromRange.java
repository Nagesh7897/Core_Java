package Numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberfromRange {
	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Please Enter the range to check Prime Number");
	int start=scanner.nextInt();
	int end=scanner.nextInt();
	List<Integer> list=new ArrayList<>();
	
	for(int j=start;j<=end;j++)
	{
		int flag=0;
		for(int i=2;i<j;i++)
		{
			if (j%i==0)
			{
				flag=1;
				break;	
			}
		}
		if(flag==1)
		{
			
		}
		else
		{
	     list.add(j); 
		}
		}
	System.out.println(list);
	scanner.close();
}
}
