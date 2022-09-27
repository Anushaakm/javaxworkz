class ColorRunner
{
	public static void main(String [] args)
	{
		System.out.println("main start agtha ede");

		Color.save("Red");
		Color.save("Green");
		Color.save("blue");
		Color.save("Black");
		Color.save("yellow");
		Color.save("Orange");
		Color.save("black");
	

		Color.displayColors();
		
		boolean found=Color.find("Red");
		System.out.println("color found "+found);

	}


}