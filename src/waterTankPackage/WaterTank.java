package waterTankPackage;

public class WaterTank {

	int tankCapacity;
	int waterLevel;
	int left = 0;

	void fillWater() {

		while (tankCapacity <= 100) {

			if (waterLevel <= 100) {
				System.out.println("Water level in the tank is now " + waterLevel + " liters.");
				left = 100 - waterLevel;
			}

			waterLevel = waterLevel + 10;
			tankCapacity = tankCapacity + 10;
		}
		if (left != 0) {
			System.out.println(left + " Litres can only be added");
			System.out.println("Tank will Overflow if add more than " + left + " Litres");
		}

	}
}
