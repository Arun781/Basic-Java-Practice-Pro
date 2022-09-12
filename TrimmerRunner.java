class TrimmerRunner{
	public static void main(String[] args)
	{
		System.out.println(Trimmer.brand);
		System.out.println(Trimmer.color);
		System.out.println(Trimmer.price);
		System.out.println(Trimmer.working);
		System.out.println(Trimmer.totalSettings);
		
	    String brand="philips";
		System.out.println("The brand of the Trimmer is "+brand+".");
	    String color="black";
		System.out.println("The color of the Trimmer is "+color+".");
	    int price=1599;
		System.out.println("The price of the Trimmer is "+price+"rupees"+".");
	    boolean working = true;
		System.out.println("The Working Status of the Trimmer is "+ working+".");
	    
	    for (int index=0; index<Trimmer.totalSettings.length; index++)
	    {
		String ref0=Trimmer.totalSettings[index];
		System.out.println("totalSettings: "+index +"brand: "+ref0+".");
	    }	
    }				
}
	
	
	
	