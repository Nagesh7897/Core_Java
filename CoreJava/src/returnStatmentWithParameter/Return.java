package returnStatmentWithParameter;

import java.util.Scanner;

public class Return {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		Operations operation = new Operations();
		System.out.println("Enter two numbers for Operation");
		int a =scanner.nextInt();
		int b=scanner.nextInt();
		
		operation.add(a, b);                                  // We are providing UserInput into a,b
		System.out.print("Addition : ");                    // Static Data also we can return 
		System.out.println(operation.add(a, b));
	//	int d = operation.add(a, b);
	//	System.out.println(operation.add(a, b));

		operation.sub(a, b);
		System.out.print("Substraction : ");
		System.out.println(operation.sub(a, b));  
		
		operation.mult(a, b);
		System.out.print("Multiplication : ");
		System.out.println(operation.mult(a, b));
		
		operation.div(a, b);
		System.out.print("Division : ");
		System.out.println(operation.div(a, b));
		
		scanner.close();
	}
}


class Operations 
{
	public int add(int a , int b)
	{
		int c = a+ b;
		return c;
	}
	
	public int sub(int p , int q)            // we can give any user input name in method e-respective of main class
	{
		int r = p- q;
		return r;
	}
	
	public int mult(int a , int b)
	{
		int c = a* b;
		return c;
	}
	
	public double div(int a , int b)
	{
		double c = a/ b;
		return c;
	}
}