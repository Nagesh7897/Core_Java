package Numbers;

import java.util.Scanner;

public class AdditionOfNumber {

	public static void main(String[] args) {
		
		int num;
		Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter Number to check");
	    num=scanner.nextInt();
	    
	    int store=0,result=0;
	    while(num>0)                    //entry Control Loop
	    {
	    store=num%10;
	    num=num/10;                        //to get each number separately
	    result=result+store;               //to add the numbers
	    System.out.println(store);
	    }
	    
		System.out.println("Addition of the Numbers= "+result);
		scanner.close();
	}

}
