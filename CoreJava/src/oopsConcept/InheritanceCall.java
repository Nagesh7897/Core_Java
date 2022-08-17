package oopsConcept;

class Maruti
{
 public void fourTyers()
 {
	 System.out.println("There are four tyers in car");
 }
}

class Santro
{
 public void powerWindows()
 {
	 System.out.println("Santro have Power Windows");
 }
}

class Audi
{
 public void airbag()
 {
	 System.out.println("Audi have Airbag");
 }
}


public class InheritanceCall {

	public static void main(String[] args) {
		
		
		Maruti maruti=new Maruti();
		maruti.fourTyers();
		
		Santro santro =new Santro();
		santro.powerWindows();
		
		Audi audi= new Audi();
		audi.airbag();
	}

}
