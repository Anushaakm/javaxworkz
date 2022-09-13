class FoodItemsRunner{
	public static void main(String[] food){
		
		String[] food_items={"Pasta","Rice","Gulab_jamuna","Rasgulla","Jams","Sandwiches","Idli","Dose","Chapathi","Pulav","Paddu","Roti","Biriyani","Parota"};
		
		int count=food_items.length;
		System.out.println("Number of items: "+count);
		System.out.println("**********list of Food Items**********");
		
		for(int fooditemindex=0;fooditemindex<count;fooditemindex++)//
		{
			System.out.println(food_items[fooditemindex]);
		}
		
		System.out.println("************Updated items************");
		
		food_items[3]="mudde";
		food_items[7]="pokoda";
		for(int fooditemindex=0;fooditemindex<count;fooditemindex++)
		{
			System.out.println(food_items[fooditemindex]);
		}
	}
}