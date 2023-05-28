package rocketPackage;

public class Rocket implements Spaceship {
	private int rocketCost;
	private int rocketWeight;
	private int maxWeight;
	private double launchExplosionChance;
	private double landingCrashChance;
	private double currentWeight;

	public Rocket(int rocketCost, int rocketWeight, int maxWeight, double launchExplosionChance,
			double landingCrashChance) {
		this.rocketCost = rocketCost;
		this.rocketWeight = rocketWeight;
		this.maxWeight = maxWeight;
		this.launchExplosionChance = launchExplosionChance;
		this.landingCrashChance = landingCrashChance;
		this.currentWeight = rocketWeight;
	}

	public boolean launch() {
		return true;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double getCurrentWeight() {
		return currentWeight;
	}

	public void setCurrentWeight(int currentWeight) {
		this.currentWeight = currentWeight;
	}

	public boolean land() {
		return true;
	}

	public boolean canCarry(Item material) {
		boolean canCarry = false;
		if (currentWeight + material.getWeight() <= maxWeight) {
			canCarry = true;
		}
		return canCarry;
	}

	public void carry(Item material) {
		currentWeight += material.getWeight();
	}

	public int getRocketCost() {
		return rocketCost;
	}
}
