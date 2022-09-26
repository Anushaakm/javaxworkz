class TempleDataOperatorRunner{

	public static void main(String[] args)
	{
		System.out.println("main: nadita ide");
		TempleDataOperator.save("Ganapathi");
		TempleDataOperator.save("Shiva");
		TempleDataOperator.save("Parvathi");
		TempleDataOperator.save("laxhmi");
		
		TempleDataOperator.displayDetails();
		System.out.println("main: Mugitu");
	
	}

}