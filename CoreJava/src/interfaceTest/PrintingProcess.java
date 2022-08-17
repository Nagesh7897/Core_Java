package interfaceTest;

public class PrintingProcess {

	public static void main(String[] args) {
		OffsetPrinting offsetPrinting =new OffsetPrinting();     //object
		
		offsetPrinting.PrintingProcessName();                    //Calling Methods
		offsetPrinting.Year();
		offsetPrinting.MachinCost();
		offsetPrinting.MinimumQuantity();
		offsetPrinting.PrintingSpeed();
		
		System.out.println();
		System.out.println();
		
		GravurePrinting gravurePrinting = new GravurePrinting();              //object 
		gravurePrinting.PrintingProcessName();
		gravurePrinting.Year();
		gravurePrinting.MachinCost();
		gravurePrinting.MinimumQuantity();
		gravurePrinting.PrintingSpeed();
		
	}

}
