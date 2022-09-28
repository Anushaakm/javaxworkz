class BillionariesRunner
{
	public static void main(String [] args)
	{
		System.out.println("main start agtha ede");

		Billionaries.save("Elon Musk");
	Billionaries.save("Bernard Arnault");
	Billionaries.save("Gautam Adani");
	Billionaries.save("Jeff Bezos");
	Billionaries.save("Bill Gates");
	Billionaries.save("Warren Buffett");
	Billionaries.save("Larry Ellison");
	Billionaries.save("Larry Page"); 
	Billionaries.save("Mukesh Ambani");
	Billionaries.save("Sergey Brin");	
	

		Billionaries.displayData();
		
		boolean found=Billionaries.findName("Redddd");
		System.out.println("color found "+found);
		
		Billionaries.update("Redddd","Anu");
		Billionaries.displayData();
		
		Billionaries.update(5,"Michael Bloomberg");
	    Billionaries.displayData();
	
	boolean del1=Billionaries.delete("Gautam Adani");
	Billionaries.displayData();
	
	boolean del2=Billionaries.delete(6);
	Billionaries.displayData();
	
	System.out.println("main: mugithu");
		
	}


}