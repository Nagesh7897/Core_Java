package firstclass;


class bike
{
public void Moterbike()
   {
	System.out.println("Moterbike-Secondary Class");
   }
}

class car
{
	public void sportscar()
	   {
		System.out.println("car-Secondary Class");
	   }
}

class game
{
	public void IGI()
	   {
		System.out.println("IGI-Secondary Class");
	   }
}


public class Firstclass {

	public static void main(String[] args) {
		
	System.out.println("Main Class");
		
	   bike ride=new bike();
	   ride.Moterbike();
	   
	   car speed =new car();
	   speed.sportscar();

	   game pc=new game();
	   pc.IGI();
	
	}

}
