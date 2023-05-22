package compositionDemo;

public class CarDealershipMain {

	public static void main(String[] args) {
	
		Dealership ds = new Dealership();
		Car hondaCivic = new Car("Honda", "White", 5, 24000);
		Car kiaSeltos = new Car("Kia", "Blue", 5, 20000);
		Car toyotaCamry = new Car("Toyota", "Red", 5, 35000);

		
		ds.addCarsToDealership(hondaCivic);
		ds.addCarsToDealership(kiaSeltos);
		ds.getCarsInDealership();
		
//		
//		Car[] carListMain = new Car[5];
//		Dealership ds2 = new Dealership();
//		carListMain[0] = toyotaCamry;
//		carListMain[1] = kiaSeltos;
//		carListMain[2] = hondaCivic;
//		ds2.addCarsToDealership(carListMain);
//		ds2.getCarsInDealership();
	}

}
