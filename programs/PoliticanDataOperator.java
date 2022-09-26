class PoliticanDataOperator{
static String[] names={null,null,null,null};
static int position=0;

static void save(String name){
	System.out.println("Save: Nadita ide");
	names[position]=name; 
	position++;
	System.out.println("Movie name is: "+name+" at position"+position);
	System.out.println("Save: mugithu");
	
	
}
static void   displayDetails()
	{
		System.out.println("displayDetails start");
		for (int index=0;index<names.length;index++)
		{
			System.out.println("element is : "+names[index]);
		}
	}

}