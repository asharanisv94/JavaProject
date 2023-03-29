package samplepackage;

public class Washingmain {

	public static void main(String[] args) {

		Washingmachine w = new Washingmachine();
		w.brandName = "Samsung";
		w.modelName = "WF45T6000AW Front Load Washer";
		w.maximumLoadCapacity = "10 Kg";
		w.isdryerpresent = false;
		w.quickwashTime = 35;
		w.normalwashTime = 50;
		w.washing();
		w.quickwash();
		w.normalwash();
		w.dry();
		System.out.println("---------");
	}

}
