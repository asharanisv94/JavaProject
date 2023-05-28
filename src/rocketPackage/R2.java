package rocketPackage;

import java.util.Random;

public class R2 extends Rocket {
	private static double explosionChancePercentage = 0.04;
	private static double crashingChancePercentage = 0.08;

	public R2() {
		super(120, 18, 29, explosionChancePercentage, crashingChancePercentage);
	}

	@Override
	public boolean launch() {
		boolean launchSuccess;
		double random =   new Random().nextInt();
		double explosionChance = explosionChancePercentage * getCurrentWeight() / getMaxWeight();
//		System.out.println("launch explosionChancePercentage : " + explosionChancePercentage);
//		System.out.println("launch random: " + random);
		if (random > explosionChance) {
			launchSuccess = true;
		} else {
			launchSuccess = false;
		}
		return launchSuccess;
	}

	@Override
	public boolean land() {
		boolean landSuccess;
		double random =  new Random().nextInt();
		double crashingChance = crashingChancePercentage * getCurrentWeight() / getMaxWeight();
//		System.out.println("land crashingChance : " + crashingChance);
//		System.out.println("land random: " + random);

		if (random > crashingChance) {
			landSuccess = true;
		} else {
			landSuccess = false;
		}
		return landSuccess;

	}
}
