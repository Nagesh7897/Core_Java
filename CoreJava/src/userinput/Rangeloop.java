package userinput;
import java.util.Scanner;


public class Rangeloop {

		public static void main(String[] args) {
			Scanner scanner= new Scanner(System.in);
			System.out.println("Please enter Range numbers");
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			
			for(int i=a ; i<=b; i++)
			{
				System.out.print(i + "Numberis divisible by ");
				if (i%3==0)
				{
					System.out.print(" 3");
				}

				if (i%4==0)
				{
					System.out.print(" 4");
				}
			
				if (i%5==0)
				{
					System.out.print(" 5");
				}	
				System.out.println();
				scanner.close();
			}
			
			
	}


}
