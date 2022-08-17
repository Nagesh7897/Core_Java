package userinput;

import java.util.Scanner;

public class TestVowel {

	public static void main(String[] args) {
    
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Letter/World: ");
		
		char x= scanner.next().charAt(0);        // It will take a first letter in consideration
		
		if (x=='a' ||  x=='e'  || x=='i'  || x=='o'  ||  x=='u')
		{
			System.out.println("This is Vowel");
		}
		else
		{
			System.out.println("This is Consonant");			
		}
		scanner.close();
	}

}
