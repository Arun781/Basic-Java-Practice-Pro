class ForestRunner{
	public static void main (String [] Toxic)
	{
		
		System.out.println("The forest name is"+Forest.forestName);
		System.out.println("The forest created by"+Forest.created);
		System.out.println("The forest located  in "+Forest.located);
		System.out.println("The forest established in the year of "+Forest.year);
		System.out.println("The varities animals in forest"+Forest.species);
		
		Forest.forestName= "Bandipur National Park";
		System.out.println("The forest name is"+Forest.forestName+".");
		Forest.created= "The Maharaja of the Kingdom of Mysore";
		System.out.println("The forest created by"+Forest.created+".");
		Forest.located= "Chamarajnagar district";
		System.out.println("The forest located  in "+Forest.located+".");
		Forest.year= 1973;
		System.out.println("The forest established in the year of "+Forest.year+".");
		
		for(int diff=0; diff<Forest.species.length; diff++)
		{
			String ref=Forest.species[diff];
			System.out.println("Animals Name:-"+diff+"Name"+ref+".");
		}
		
		
		
	}
}