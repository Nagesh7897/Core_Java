package firstclass;

class Mathsoperations
{
public void Addition()
   {
	int a,b,c;
	a=10; b=20;
	c=a+b;
	System.out.println("Addition is " +c);
   }

public void Substraction(int a)
   {
	int b,c;
	b=9;
	c=a-b;
	System.out.println("Substraction is " +c);
   }

public void Multiplication(int a, int b)
  {
	int c;
	c=a*b;
	System.out.println("Multiplication is " +c);
  }

public void Division(int a, int b)
{
	int c;
	c=a/b;
	System.out.println("Division is " +c);
}
}

public class Mathematicaloperations {

	public static void main(String[] args) {
	System.out.println("Mathematicaloperations");
	
	Mathsoperations operations= new Mathsoperations();
	operations.Addition();
	operations.Substraction(5);
	operations.Multiplication(3,8);
	operations.Division(8,2);
	}

}
