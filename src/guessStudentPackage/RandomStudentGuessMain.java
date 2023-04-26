package guessStudentPackage;

import java.io.IOException;
import java.util.*;

public class RandomStudentGuessMain {

	public static void main(String[] arg) throws IOException {
		Random random = new Random();
		RandomStudentGuess stud = new RandomStudentGuess();
		List<String> studentListMain = stud.readFile();
		int randomIndex = random.nextInt(studentListMain.size());
		char[] randomNameArray = stud.selectRandomStudentName(randomIndex);
		stud.guessStudentName(randomNameArray);
	}

}
