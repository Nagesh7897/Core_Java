package Numbers;

import java.util.Scanner;

public class ReverseNumber {

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
	    result=result*10 +store;    //to reverse the number
	 //   System.out.println(store);
	    }
	    
		System.out.println("Reverse No= "+result);
		scanner.close();

	}

}
