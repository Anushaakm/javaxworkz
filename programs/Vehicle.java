class Vehicle{
	
	
static double transport(String source,String destination)
{
	System.out.println("entered transport which takes source and destination");
	if(source=="banglore"&&destination=="mysore")
	{
	System.out.println("source= "+source+ " destination= "+destination);
	return 145.8;
	}
	if(source=="banglore"&&destination=="shimoga")
	{
			System.out.println("source= "+source +" destination= "+destination);
	return 280;
	}
	
	if(source=="chennai"&&destination=="banglore")
	{
	System.out.println("source= "+source +" destination= "+destination);
	return 346.7;
	}
	else
		System.out.println("distance not calculated");
		
	return 0;
}


 static double transport(String source,String destination, String ontime)
 {
	 System.out.println("entered transport which takes source destination and ontime");
	 if(ontime=="yes"){
		System.out.println("reached on time");
	 return 1;}
	 else
		 System.out.println("did not reach on time");
		 return 0;
 }
 
 
  static boolean transport( String destination){
	  System.out.println("entered transport which takes destination");
	   if(destination=="reached"){
		  System.out.println("destination reached");
	  return true;
	   }
	   if(destination=="not reached"){
		   System.out.println("destination not reached");
	   }
	   return false;
	 
  }
  
  
    static boolean transport(String destination, boolean ontime){
		System.out.println("entered transort which takes destination and ontime");
		System.out.println("destination is "+destination); 
		if(ontime==true){
		System.out.println("reached on time");
	 return true;}
	 if(ontime==false)
		 System.out.println("did not reach on time");
		 return false;
	}
	
	
	static boolean transport( boolean ontime){
		System.out.println("entered transport which takes ontime");
		
		if(ontime==true){
		System.out.println("reached on time");
	 return true;}
	 if(ontime==false)
		 System.out.println("did not reach on time");
		 return false;
		
	} 
		
		
}


	