package waterTankPackage;

public class WaterTank {

	int tankCapacity = 100;
	int waterLevel = 0;
	int numBuckets;

	void fillWater() {
		int bucketWaterInLitre = numBuckets * 10;
		if ((waterLevel + bucketWaterInLitre) > tankCapacity)

		{
			System.out.println("The tank will overflow. Please enter a lower number of buckets.");

		} else {
			waterLevel = waterLevel + bucketWaterInLitre;
			System.out.println("Water level in the tank is now " + waterLevel + " liters.");
		}
	}
}
