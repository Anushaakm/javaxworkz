class PoliticanDataOperatorRunner{

	public static void main(String[] args)
	{
		System.out.println("main: nadita ide");
		TempleDataOperator.save("Mohandas Karamchand Gandhi");
		TempleDataOperator.save("Pratap Singh Kairon");
		TempleDataOperator.save("Balwant Rai Mehta");
		TempleDataOperator.save("Ramdas Nayak");
		
		TempleDataOperator.displayDetails();
		System.out.println("main: Mugitu");
	
	}

}