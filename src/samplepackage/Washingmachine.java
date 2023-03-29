package samplepackage;

public class Washingmachine {

	String brandName;
	String modelName;
	String maximumLoadCapacity;
	boolean isdryerpresent;
	int quickwashTime;
	int normalwashTime;

	void washing() {
		System.out.println("Washing in " + brandName + " " + modelName);
		System.out.println("Maximum Load capacity is " + maximumLoadCapacity);
	}

	void quickwash() {

		System.out.println("quick wash for " + brandName + " " + modelName + " takes " + quickwashTime + " minutes");

	}

	void normalwash() {
		System.out.println("Normal wash for " + brandName + " " + modelName + " takes " + normalwashTime + " minutes");
	}
	void dry()
	{
		System.out.println("is drying possible :"+isdryerpresent);
	}
	
}
