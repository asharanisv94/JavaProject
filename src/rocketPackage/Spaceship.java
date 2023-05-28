package rocketPackage;

public interface Spaceship {
	boolean launch();

	boolean land();

	boolean canCarry(Item material);

	void carry(Item material);

}
