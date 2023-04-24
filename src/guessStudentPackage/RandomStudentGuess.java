package guessStudentPackage;

import java.util.Scanner;

public class RandomStudentGuess {
	String student[] = { "Aleena", "Angel", "Asha", "Clemin", "Gopesh", "Hamneet", "Jimna", "Jobin", "Jude",
			"Kamaldeep", "Manpreetk", "Manpreets", "Mariya", "Namitha", "Neelam", "Nisha", "Parminder", "Rajat", "Rojy",
			"Sojan", "Sucharita", "Vindhuja" };
	String studentName;
	Scanner sc = new Scanner(System.in);

	char[] selectRandomStudentName(int randomIndex) {

		studentName = student[randomIndex];

		// System.out.println(randomIndex);
		// System.out.println(studentName);
		char[] nameCharArray = new char[studentName.length()];
		for (int i = 0; i < studentName.length(); i++) {
			nameCharArray[i] = '-';
		}

		System.out.println(nameCharArray);
		return nameCharArray;
	}

	void guessStudentName(char[] nameCharArray) {
		int counter = 0;

		do {
			boolean found = false;
			System.out.println("\nGuess a character");
			char getCharacter = sc.nextLine().charAt(0);
			for (int i = 0; i < studentName.length(); i++) {

				if (Character.toLowerCase(studentName.charAt(i)) == Character.toLowerCase(getCharacter)) {
					nameCharArray[i] = studentName.charAt(i);
					found = true;
				}
			}

			if (found == false) {
				counter = counter + 1;
			}

			System.out.println(nameCharArray);
			System.out.println("You have guessed (" + (counter) + ") wrong letters");
			System.out.println("You have (" + (5 - counter) + ") attempts left");

			boolean won = true;
			for (int j = 0; j < nameCharArray.length; j++) {
				if (nameCharArray[j] == '-') {
					won = false;

				}

			}
			if (won) {
				System.out.println("You have won");
				break;
			}
			if (counter == 5) {
				System.out.println("GAME OVER!!");
			}

		} while (counter != 5);

	}
}
