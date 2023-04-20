package crsScorePackage;

import java.util.Scanner;

public class CrsScoreMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CrsScore c = new CrsScore();
		int listeningPoints;
		int speakingPoints;
		int readingPoints;
		int writingPoints;

		c.educationLevel();
		c.experienceLevel();

		System.out.println("enter your IELTS listening score");
		float listeningScore = sc.nextFloat();
		listeningPoints = c.ieltsScoreListening(listeningScore);

		System.out.println("enter your IELTS speaking score");
		float speakingScore = sc.nextFloat();
		speakingPoints = c.ieltsScoreSpeaking(speakingScore);

		System.out.println("enter your IELTS reading score");
		float readingScore = sc.nextFloat();
		readingPoints = c.ieltsScoreReading(readingScore);

		System.out.println("enter your IELTS writing score");
		float writingScore = sc.nextFloat();
		writingPoints = c.ieltsScoreWriting(writingScore);

		c.adaptability();
		c.ageScore();
		c.ieltsScore(listeningPoints, speakingPoints, readingPoints, writingPoints);
		c.finalCrsScore();

	}

}
