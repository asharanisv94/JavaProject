package stringPackage;

import java.util.Scanner;

public class SearchCitiesMain {

	public static void main(String[] args) {
		SearchCities c = new SearchCities();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a city name to search: ");
		String cityName = sc.nextLine();
		c.searchCities(cityName);

		c.searchCitiesWithTon();
		c.replaceCitiesWithTonToFun();
		c.extractAddress();

	}

}
