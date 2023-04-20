package stringPackage;

import java.util.*;

public class CityNames {
	Scanner sc = new Scanner(System.in);
	String[] cities = { "Toronto", "Ottawa", "Brampton", "Hamilton", "London", "Mississauga", "Burlington", "Kingston",
			"Kitchener" };

	void searchCities(String cityName) {
		boolean found = false;
		for (int i = 0; i < cities.length; i++) {
			if (cityName.equalsIgnoreCase(cities[i])) {
				System.out.println("City name found");
				found = true;
			}

		}

		if (found == false) {
			System.out.println("City not found in the list");
		}
	}

	void searchCitiesWithTon() {
		System.out.println("Cities ending with ton :");
		for (int i = 0; i < cities.length; i++) {
			if (cities[i].endsWith("ton")) {
				System.out.println(cities[i]);
			}
		}
	}

	void replaceCitiesWithTonToFun() {
		System.out.println("Repacing Cities ending with ton to fun:");
		for (int i = 0; i < cities.length; i++) {
			if (cities[i].endsWith("ton")) {
				cities[i] = cities[i].replace("ton", "fun");
				System.out.println(cities[i]);
			}
		}

	}

	void extractAddress() {
		System.out.println("Enter the address");
		String address = sc.nextLine();
		String[] extract = address.split(",");
		String streetAddress = extract[0];
		String city = extract[1];
		String zip = extract[2];
		System.out.println("Street address: " + streetAddress);
		System.out.println("City: " + city);
		System.out.println("Zip code: " + zip);

	}

}
