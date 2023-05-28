package rocketPackage;

import java.io.*;
import java.util.*;

public class Simulation {

	private String fileName = "Phase-1.txt";

	public ArrayList<Item> loadItems() throws NumberFormatException, IOException {
		ArrayList<Item> materialsList = new ArrayList<>();
		try {

			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				String[] splitLine = line.split("=");
				String materialName = splitLine[0];
				int materialWeight = Integer.parseInt(splitLine[1]);

				Item material = new Item(materialName, materialWeight);
				materialsList.add(material);

			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return materialsList;
	}

	public ArrayList<Rocket> loadU1(ArrayList<Item> materialsList) {
		ArrayList<Rocket> r1RocketList = new ArrayList<>();
		R1 rocket = new R1();
		for (Item material : materialsList) {

			if (rocket.canCarry(material)) {
				rocket.carry(material);
			} else {
				r1RocketList.add(rocket);
				rocket = new R1();
				rocket.carry(material);
			}
		}
		r1RocketList.add(rocket);
		return r1RocketList;
	}

	public ArrayList<Rocket> loadU2(ArrayList<Item> materialsList) {
		ArrayList<Rocket> r2RocketList = new ArrayList<>();
		R2 rocket = new R2();
		for (Item materials : materialsList) {
			if (rocket.canCarry(materials)) {
				rocket.carry(materials);
			} else {
				r2RocketList.add(rocket);
				rocket = new R2();
				rocket.carry(materials);
			}
		}
		r2RocketList.add(rocket);
		return r2RocketList;
	}

	public int runSimulation(ArrayList<Rocket> rocketList) {
		int totalCost = 0;
		for (Rocket rocket : rocketList) {
			while (!rocket.launch() || !rocket.land()) {
				totalCost += rocket.getRocketCost();
				 System.out.println("Current totalBudget when Launch fail or Land fail: " +
				 totalCost );
			}
			totalCost += rocket.getRocketCost();
			System.out.println("Current totalBudget :" + totalCost);
		}
		return totalCost;
	}
}
