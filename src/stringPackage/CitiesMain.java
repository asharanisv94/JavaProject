package stringPackage;

import java.util.Scanner;

public class CitiesMain {

	public static void main(String[] args) {
		CityNames c = new CityNames();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a city name to search: ");
		String cityName = sc.nextLine();
		c.searchCities(cityName);

		c.searchCitiesWithTon();
		c.replaceCitiesWithTonToFun();
		c.extractAddress();

	}

}
