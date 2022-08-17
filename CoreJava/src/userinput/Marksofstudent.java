package userinput;

import java.util.Scanner;

public class Marksofstudent {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Your Physics Marks");
		int Phy=scanner.nextInt();
		
		System.out.println("Enter Your Chemistry Marks");
		int Che=scanner.nextInt();
		
		System.out.println("Enter Your Maths Marks");
		int Maths=scanner.nextInt();
		
		System.out.println("Enter Your English Marks");
		int Eng=scanner.nextInt();
		
		System.out.println("Enter Your Marathi Marks");
		int Mar=scanner.nextInt();
		
		int Total= (Phy+Che+Maths+Eng+Mar)/5;
	 
		System.out.println("Your Total Average Marks Are= " + Total);
		
		
		if (Total>80)
		System.out.println("Passed with First class with Distingtion");
		
		else if(Total>60 && Total<80)
		System.out.println("Passed with First class");
		
		else if(Total>40 && Total<60)
		System.out.println("Passed with Second class");
	
		else
		System.out.println("Fail");
		
		scanner.close();
	}

}
