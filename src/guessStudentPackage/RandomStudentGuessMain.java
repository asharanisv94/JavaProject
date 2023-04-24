package guessStudentPackage;

import java.util.*;

public class RandomStudentGuessMain {

	public static void main(String[] arg) {
		Random random = new Random();
		RandomStudentGuess stud = new RandomStudentGuess();
		int randomIndex = random.nextInt(stud.student.length);

		char[] randomNameArray = stud.selectRandomStudentName(randomIndex);
		stud.guessStudentName(randomNameArray);
	}

}
