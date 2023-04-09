package waterPackage;

public class Tank {

	int waterLevel;
	int left = 0;

	void fillWater() {

		for (waterLevel =0; waterLevel <= 100; waterLevel = waterLevel + 10)

		{
			System.out.println("Water level in the tank is now " + waterLevel + " liters.");
			left = 100 - waterLevel;
			if(waterLevel==100)
			{
				System.out.println("Tank capacity is 100 litres.Tank will overflow");
		break;
			}
			
		}

		if (waterLevel > 100) {
			System.out.println("Tank capacity is 100 litres.Tank will overflow if add more than " + left + " Litres");
		}

	}
}