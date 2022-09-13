class Milestone{
	static void showTheResponsibility(){
		int age=22;
		char g='F';
		System.out.println("starts");
		if(age==10)
		{
			System.out.println("school");
			return;
		}
		if(age==16)
		{
			System.out.println("college");
		}
		if(age==18)
		{
			System.out.println("Voter,DL,");
			
			if(g=='F')
			{
				System.out.println("Voter,DL,");
				return;
			}
		}
		if(age==21)
		{
			System.out.println("Juice ");
			
			if(g=='M')
			{
			System.out.println("Marry for boys");
			}
		}
		if(age==21 || age==22 || age==23)
		{
			System.out.println("Gradutte");
			return;
		}
		if(age==23 || age==25)
		{
			System.out.println("job");
			return;
		}
		if(age==28)
		{
			System.out.println("kids");
			return;
		}
		if(age==30)
		{
			System.out.println("having another kid");
			return;
		}
		if(age==45)
		{
			System.out.println("kids future");
			return;
		}
		if(age==50)
		{
			System.out.println("kids education");
			return;
		}
		if(age==58)
		{
			System.out.println("retired");
			return;
		}
		if(age==60)
		{
			System.out.println("Grand kids");
			return;
		}
		if(age==70)
		{
			System.out.println("RIP");
			return;
		}
		
	}
	public static void main(String[] ages)
	{
		 Milestone.showTheResponsibility();
	}
	
}









