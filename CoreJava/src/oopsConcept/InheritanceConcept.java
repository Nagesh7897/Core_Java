package oopsConcept;

class Letterpress
{
	public void slow()
	{
		System.out.println("LetterPress:- Old and Slow Process, speed is 2000 sheets per hour");
	}
}

class Offset extends Letterpress
{
	public void speed()
	{
		System.out.println("Offset:- Updated Process, speed is 18000 sheets per hour");
	}
}

class Digital extends Offset
{
	public void userFriendly()
	{
		System.out.println("Digital:- Print on Demand, Time Saving");
	}
}

public class InheritanceConcept {

	public static void main(String[] args) {
		
     Digital digital=new Digital();
     
     digital.slow();
     digital.speed();
     digital.userFriendly();
			
	}
}
