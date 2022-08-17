package dataType;

import java.util.Scanner;

public class RevweseAddition {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter your numbers");
		int num=scanner.nextInt();
		int a;
		int res=0;
		
		while(num>0)
		{
			a=num%10;
			System.out.println(a);
			res=res+a;
			num=num/10;
			System.out.println("Result="+res);
			scanner.close();
		}
	}

}
