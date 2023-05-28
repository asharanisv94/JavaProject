package rocketPackage;

import java.io.IOException;
import java.util.ArrayList;

public class RocketMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Simulation simulation = new Simulation();

		ArrayList<Item> materialList = simulation.loadItems();

		ArrayList<Rocket> r1RocketList = simulation.loadU1(materialList);
		int r1RocketTotalCost = simulation.runSimulation(r1RocketList);
		System.out.println("Total cost for R1 Rockets: $" + r1RocketTotalCost);
		System.out.println();

		ArrayList<Rocket> r2RocketList = simulation.loadU2(materialList);
		int r2RocketTotalCost = simulation.runSimulation(r2RocketList);
		System.out.println("Total cost for R2 Rockets: $" + r2RocketTotalCost);
	}
}
