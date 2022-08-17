package interfaceTest;

public class OffsetPrinting implements TypesOfPrintingProcess
{

	@Override
	public void PrintingProcessName() {
		System.out.println("Process Name : Offset Printing Process");
		
	}

	@Override
	public void Year() {
		System.out.println("Year : 1948");
		
	}

	@Override
	public void MachinCost() {
		System.out.println("Price : 48 Lac");
		
	}

	@Override
	public void MinimumQuantity() {
		System.out.println("Minimum Quantity : 2 Lac");
		
	}

	@Override
	public void PrintingSpeed() {
		System.out.println("Printing Speed : 16000 sheet/hr");
		
	}

}
