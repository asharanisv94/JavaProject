package collectionAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BankingMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> nameList = new ArrayList<String>();

		nameList.add("Gopesh");
		nameList.add("Sucharita");
		nameList.add("Neelam");
		nameList.add("ManpreetS");
		System.out.println(nameList.toString());

		System.out.println("Enter the  name you want to replace");

//		Replace an element in arraylist
		String enteredName = sc.next();

		System.out.println("Enter the new name  you want to replace");
		String newName = sc.next();

		for (int i = 0; i < nameList.size(); i++) {
			if (enteredName.contains(nameList.get(i))) {
				nameList.set(i, newName);
			}
		}

		System.out.println(nameList.toString());

		// nameList.set(3, "Asha");
		// System.out.println(nameList.toString());

		System.out.println(("\n\nFinding an element is present or not in below list"));

		System.out.println(nameList.toString());

		System.out.println("enter a name");
		String enteredName1 = sc.next();
		if (nameList.contains(enteredName1)) {
			System.out.println("name is present in the list");
		} else {
			System.out.println("name not found in the list");
		}
	}
}
