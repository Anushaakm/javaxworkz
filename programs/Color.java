class Color
{
	static String []  colors={null,null,null,null,null,null,null};
	static int position=0;

	static void save(String colorName)
	{
		System.out.println("Save: naditha ide");

		if(position>=colors.length)
		{
			System.out.println("Array Is Exeeded");
			return;
		}

		if(colorName!=null && colorName.length()>=3)
		{
			colors[position]=colorName;
			System.out.println("Color :"+colorName+ " at position"+position);
			position++;

		}
		else
			System.err.println("color name is null or less than 3 charactors ");
	


	}

	static void displayColors()
	{
		for(int place=0;place<colors.length;place++)
		{
			System.out.println("colors is:  "+colors[place]);
		}

	}

	static boolean find(String name)
	{
		System.out.println("Find Color :   "+name);
		for(int i=0;i<colors.length;i++)
		{
			String ref=colors[i];

		if(ref==name){

		System.out.println("color is found :   " +name);
		return true;
		}
		}
		return false;
	}
}