package interfaceTest;

public class GravurePrinting implements TypesOfPrintingProcess
{

	@Override
	public void PrintingProcessName() {
	System.out.println("Process Name : Gravure Printing Process");
		
	}

	@Override
	public void Year() {
		System.out.println("Year : 1976");
		
	}

	@Override
	public void MachinCost() {
		System.out.println("Price : 75 Lac");
		
	}

	@Override
	public void MinimumQuantity() {
		System.out.println("Minimum Quantity : 10k");
		
	}

	@Override
	public void PrintingSpeed() {
		System.out.println("Printing Speed : 2000 sheets/hr");
		
	}

}
