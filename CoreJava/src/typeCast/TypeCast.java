package typeCast;

import java.util.Scanner;

public class TypeCast {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	String  x, y;
	System.out.println("Enter two numbers numbers");  
	x= scanner.next();                   // Converting String Values in float and Integer
	y= scanner.next();
	
	float p,q;
	p=Float.parseFloat(x);        // for float
	q=Float.parseFloat(y);
    
	float z= p*q;
	System.out.println(z);
	
	
	int r,s;
	r=Integer.parseInt(x);
	s=Integer.parseInt(y);        // for Integer
    
	int n= r+s;
	System.out.println(n);
	
	
//	
//	float a,b;
//	int c;
//	System.out.println("Enter two float numbers");
//	a= scanner.nextFloat();
//	b= scanner.nextFloat();
//	
//	c= (int) (a+b);          // Casting of float to int 
			
    scanner.close();
	}

}
