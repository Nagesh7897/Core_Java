package oopsConcept;

class Overload                 
{
 public void same()
 {
	 System.out.println("one object");
 }

 public void same(int a)  // Same object name to run the code we are providing input in second method
 {
	 System.out.println("object name is same, provided input for Overload");
 }
}


public class OverloadJava {

	public static void main(String[] args) {
		
		Overload overload=new Overload();
		overload.same();
		overload.same(3);
	}

}
