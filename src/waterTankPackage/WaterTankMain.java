package waterTankPackage;

import java.util.Scanner;

public class WaterTankMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		WaterTank w = new WaterTank();
		System.out.print("Enter the number of buckets required to fill the tank: ");
		w.numBuckets = sc.nextInt();
		w.fillWater();
	while(w.waterLevel<100)
		{
		System.out.println("Enter the number of buckets required to fill the remaining tank:");
		w.numBuckets = sc.nextInt();
		w.fillWater();
		
		}
	}

}
