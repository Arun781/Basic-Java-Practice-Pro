class WashingMachineRunner{
	public static void main(String[] toxic)
	{	
	System.out.println("Declaring the Washing Machine class static Properties in a WashingMachineRunner main method static");

	 String brand  = WashingMachine.brand;
	 int princs = WashingMachine.princs;
	 String load   = WashingMachine.load;
	 double weight = WashingMachine.weight;
	 long time   =WashingMachine.time;
	 short pair   =WashingMachine.pair;
	 double maxspeed= WashingMachine.maxspeed;
	 int capacity =WashingMachine.capacity;
	  
	  
	  System.out.println("The brand of Washing Machine is :-" + brand);
	  System.out.println("The princs of Washing Machine is :-" + princs);
	  System.out.println("The load of Washing Machine is :-" + load);
	  System.out.println("The weight of Washing Machine is :-" + weight);
	  System.out.println("The time of Washing Machine is :-" + time);
	  System.out.println("The pair of Washing Machine is :-" + pair);
	  System.out.println("The maxspeed of Washing Machine is :-" + maxspeed);
	  System.out.println("The capacity of Washing Machine is :-" + capacity);
	}
}