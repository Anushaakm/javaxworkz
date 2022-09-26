class FoodItemsDataOperatorRunner{

	public static void main(String[] args)
	{
		System.out.println("main: nadita ide");
		TempleDataOperator.save("Dose");
		TempleDataOperator.save("Mudde");
		TempleDataOperator.save("Roti");
		TempleDataOperator.save("Chapathi");
		
		TempleDataOperator.displayDetails();
		System.out.println("main: Mugitu");
	
	}

}