package compositionDemo;

public class Dealership {

	public String dealershipName;

	Car[] carList = new Car[10];

	public void addCarsToDealership(Car carBroughtToDelership) {

		for (int i = 0; i < carList.length; i++) {
			if (carList[i] == null) {
				carList[i] = carBroughtToDelership;
				break;
			}
		}

	}

	public void addCarsToDealership(Car[] carListMain) {

		for (int i = 0; i < carListMain.length; i++) {
			if (carList[i] == null) {
				carList[i] = carListMain[i];
			}
		}

	}

	public void getCarsInDealership() {
	
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] != null) {
				System.out.println("*************************");
				System.out.println(carList[i].getBrandName());
				System.out.println(carList[i].getColour());
				System.out.println(carList[i].getPriceOfCar());
				System.out.println(carList[i].getSeatingCapacity());
			}
		}
		System.out.println("------------------------------------");
	}

}
