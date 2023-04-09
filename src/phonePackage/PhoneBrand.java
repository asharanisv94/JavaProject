package phonePackage;

import java.util.*;

public class PhoneBrand {
	Scanner sc = new Scanner(System.in);
	String phoneName;
	String productName;
	String[] sProductArray = new String[4];
	String[] gProductArray = new String[4];
	String[] aProductArray = new String[4];

	

	void selectPhone() {
		sProductArray[0] = "S20";
		sProductArray[1] = "S21";
		sProductArray[2] = "FLIP3";
		sProductArray[3] = "FOLD3";

		gProductArray[0] = "GooglePixel6";
		gProductArray[1] = "GooglePixel6Pro";
		gProductArray[2] = "GooglePixelPro";
		gProductArray[3] = "GooglePixel5";

		aProductArray[0] = "Iphone12";
		aProductArray[1] = "Iphone12mini";
		aProductArray[2] = "Iphone11";
		aProductArray[3] = "Iphone11Pro";

		if (phoneName.equalsIgnoreCase("SAMSUNG")) {
			
			System.out.println("Enter the product you need");
			System.out.println(Arrays.toString(sProductArray));
			productName = sc.nextLine();
			for (int i = 0; i < sProductArray.length; i++) {
				if (productName.equalsIgnoreCase(sProductArray[i])) {
					System.out.println("Product selected is " + sProductArray[i]);
					break;
				} else if(i==sProductArray.length-1){
					System.out.println("Error!!Please select a product from the list");
					break;
				}

			}

		} else if (phoneName.equalsIgnoreCase("GOOGLE")) {
			System.out.println("Enter the product you need");
			System.out.println(Arrays.toString(gProductArray));
			productName = sc.nextLine();
			for (int i = 0; i < gProductArray.length; i++) {
				if (productName.equalsIgnoreCase(gProductArray[i])) {
					System.out.println("Product selected is " + gProductArray[i]);
					break;
				} else  if(i==gProductArray.length-1){
					System.out.println("Error!!Please select a product from the list");
					break;
				}

			}

		} else if (phoneName.equalsIgnoreCase("APPLE")) {
			System.out.println("Enter the product you need");
			System.out.println(Arrays.toString(aProductArray));
			productName = sc.nextLine();
			for (int i = 0; i < aProductArray.length; i++) {
				if (productName.equalsIgnoreCase(aProductArray[i])) {
					System.out.println("Product selected is " + aProductArray[i]);
					break;
				} else  if(i==aProductArray.length-1){
					System.out.println("Error!!Please select a product from the list");
					break;
				}

			}

		} else {
			System.out.println("Invalid Entry");

		}
	}
}