class Product{

     public static void main (String[]  products)
 {
     System.out.println("Cheking the product information");
	 System.out.println("information:"+Product.length);
     String ref=products[0];
	 String ref1=products[1];
	 String ref2=products[2];
	 String ref3=products[3];
	 String ref4=products[4];
	  
	 
	 System.out.println(" Product name:"+ref);
	 System.out.println("Product price:"+ref1);
	 System.out.println("Product type:"+ref2);
	 System.out.println("Product quality:"+ref3);
	 System.out.println("Prducct quantity:"+ref4);
	 
     int convertedprice=Integer.parseInt(ref1);
	 System.out.println("converted price:"+convertedprice);
	 if(convertedprice>=2000)
	 {
		 System.out.println("very costly ");
	 }
	 else
	 {
		 System.out.println("its ok");
	 }
 
     boolean convertedquality=Boolean.parseBoolean(ref3);
	 System.out.println("convertedquality:"+convertedquality);
	 if(convertedquality==true)
	 {
		 System.out.println("quality is good");
	 }
     else
	 {
		 System.out.println("quality is not good");
	 }
	 float convertedquantity=Float.parseFloat(ref4);
	 System.out.println("convertedquantity:"+convertedquantity);
	 if(convertedquantity<=1000)
	 {
		 System.out.println("Standard quantity");
	 }
	 else
	 {
		 System.out.println("quality is bad");
	 }
	 
	 double totalPrice=(convertedprice+convertedquantity);
	 if(totalPrice>=12)
	 {
		 System.out.println("More Products");
	 }
	 else
	 {
		 System.out.println("Less Products ");
	 }
	
     }

}