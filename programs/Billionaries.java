class Billionaries{
static String[] names={null,null,null,null,null,null,null,null,null,null};
static int index=0;


static void save(String name)
{
	
	System.out.println("Save: Nadita ide");
	
	if(name!=null && index<=names.length && name.length()>5)
	{
	System.out.println("Entered 10 names into an array with more than 4 chars");
	names[index]=name;
	index++;
	System.out.println("The Billionar : "+name+ "at the Index"+index);
	System.out.println("Save: Mugitu");
	System.out.println("");
	System.out.println("");
	
	}
	else
	{
		System.out.println("Entered less or more names in an array or chars");

	}
	
}

static void displayData()
{
	System.out.println("DispalyData: Nadita ide");
	
	for(int i=0;i<names.length;i++)
	{
		System.out.println("Billionaries are:"+names[i]);
	System.out.println("");	
	}
	
}


static boolean findName(String bname)
{
	System.out.println("fine name: Nadita ide");
	System.out.println("Find color: "+bname);
	for(int point=0;point<names.length;point++)
	{
		String ref=names[point];
		if(ref==bname)
		{
			System.out.println("Found billionar");
			return true;
		}
		
	}
	
	return false;
}

static void update(String oldName, String newName)
{
	if(oldName!=null && newName!=null )
		if(oldName.length()>5 && newName.length()>5)
		{
			for(int index=0;index<names.length;index++)
			{
				if(oldName==names[index])
				{
					String ref=names[index];
					names[index]=newName;
					System.out.println("updated vale is: "+names[index]);	
				}
			}
		}
	
	else
	{
		System.err.println("*************************************Name is invalid********************************");	
	}
	
}

static void update(int position, String newName)

{
	if(newName!=null){
	String ref=names[position];
	names[position]=newName;
	System.out.println("updated value is: "+names[position]+"at index"+position);	
	}
	else{
		System.err.println("*************************************Name is invalid********************************");	
	}
}

static boolean delete(String name)
{
	if(name!=null )
		if(name.length()>5)
		{
			for(int index=0;index<names.length;index++)
			{
				if(name==names[index])
				{
					String ref=names[index];
					names[index]=null;
					System.out.println("Deleted value is: "+names[index]);	
					return true;
				}
			}
		}
	
	else
	{
		System.err.println("*************************************Name is invalid********************************");	
	}
	return false;
	
}
static boolean delete(int position)
	{
		if(names[position]!=null)
		{
			System.out.println("Entered delete using index");
			names[position]=null;
			System.out.println("Deleting index: "+position);
			return true;
		}
		
		else
		{
			System.out.println("Cannot Delete null");
			
			
		}
		return false;
	}
	

}