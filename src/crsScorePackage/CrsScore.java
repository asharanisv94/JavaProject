package crsScorePackage;

import java.util.Scanner;

public class CrsScore {
	Scanner sc = new Scanner(System.in);
	int educationScore = 0;
	int experienceScore = 0;
	int ageScore = 0;
	int ieltsTotalScore = 0;
	int adaptabilityScoreTotal = 0;

	int finalScore = 0;

	void educationLevel() {
		int educationLevel;
		System.out.println("Enter your education level from below.Please enter the valid option number");
		System.out.println(
				"1.PhD \n2.Master’s Degree \n3.Two or more university degrees/diplomas at the bachelor’s level one of which is a three year or longer duration \n4.12th+ Three Years or longer Degree /Diploma");
		educationLevel = sc.nextInt();
		if (educationLevel == 1) {
			educationScore = 25;

		} else if (educationLevel == 2) {
			educationScore = 23;

		} else if (educationLevel == 3) {
			educationScore = 22;

		} else if (educationLevel == 4) {
			educationScore = 21;
		} else {
			System.out.println("Invalid Option Number selected");
		}
	}

	void experienceLevel() {
		int experienceLevel;
		System.out.println("Enter your experience Levelfrom below list.Please enter the valid option number");
		System.out.println("1.4-5 years \n2.6 or more \n3.NONE of above");
		experienceLevel = sc.nextInt();

		if (experienceLevel == 1) {
			experienceScore = 13;

		} else if (experienceLevel == 2) {
			experienceScore = 15;

		} else if (experienceLevel == 3) {
			experienceScore = 0;

		} else {
			System.out.println("Invalid Option Number selected");
		}
	}

	int ieltsScoreListening(float listeningScore) {

		int listeningPoints = 0;

		if (listeningScore >= 8) {
			listeningPoints = 6;

		} else if (listeningScore == 7.5) {
			listeningPoints = 5;
		}
		return listeningPoints;
	}

	int ieltsScoreSpeaking(float speakingScore) {

		int speakingPoints = 0;

		if (speakingScore >= 7) {
			speakingPoints = 6;

		} else if (speakingScore == 6.5) {
			speakingPoints = 5;
		}
		return speakingPoints;
	}

	int ieltsScoreReading(float readingScore) {

		int readingPoints = 0;

		if (readingScore >= 7) {
			readingPoints = 6;

		} else if (readingScore == 6.5) {
			readingPoints = 5;
		}
		return readingPoints;
	}

	int ieltsScoreWriting(float writingScore) {

		int writingPoints = 0;

		if (writingScore >= 7) {
			writingPoints = 6;

		} else if (writingScore == 6.5) {
			writingPoints = 5;
		}
		return writingPoints;
	}

	void ieltsScore(int listeningPoints, int speakingPoints, int readingPoints, int writingPoints) {
		ieltsTotalScore = listeningPoints + speakingPoints + readingPoints + writingPoints;

	}

	void adaptability() {

		boolean isAdaptabilityRelative = false;
		boolean isAdaptabilityCanadaEducation = false;
		boolean isAdaptabilityNoc = false;
		System.out.println("Please enter true or false for the below");
		System.out.println(
				"DO you have a relative  in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle, Nephew or Niece who is a Canadian Citizen or PR holder");
		isAdaptabilityRelative = sc.nextBoolean();

		if (isAdaptabilityRelative) {
			adaptabilityScoreTotal = adaptabilityScoreTotal + 5;
		}

		System.out.println("Did you Study in Canada for two years");
		isAdaptabilityCanadaEducation = sc.nextBoolean();

		if (isAdaptabilityCanadaEducation) {
			adaptabilityScoreTotal = adaptabilityScoreTotal + 5;
		}

		System.out.println("Did you Work in Canada for one year at NOC 0, A, B ");
		isAdaptabilityNoc = sc.nextBoolean();

		if (isAdaptabilityNoc) {
			adaptabilityScoreTotal = adaptabilityScoreTotal + 10;
		}
	}

	void ageScore() {

		int[] agePoint = new int[48];

		int ageCounter = 12;
		for (int i = 1; i < agePoint.length; i++) {

			if (i < 18) {
				agePoint[i] = 0;
			} else if (i >= 18 && i <= 35) {
				agePoint[i] = 12;
			} else if (i > 35) {
				ageCounter = ageCounter - 1;
				agePoint[i] = ageCounter;
			}

		}

		System.out.println("Enter Your age");
		int age = sc.nextInt();

		ageScore = agePoint[age];

	}

	void finalCrsScore() {
		System.out.println("educationScore " + educationScore);
		System.out.println("experienceScore " + experienceScore);
		System.out.println("ageScore " + ageScore);
		System.out.println("ieltsTotalScore " + ieltsTotalScore);
		System.out.println("adaptabilityScoreTotal " + adaptabilityScoreTotal);
		finalScore = educationScore + experienceScore + ageScore + ieltsTotalScore + adaptabilityScoreTotal;
		System.out.println("Final CRS Score: " + finalScore);
		if (finalScore > 67) {
			System.out.println("You qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		}

		else {
			System.out.println("Ineligible to submit an Expression of Interest (EOI) to Immigration Canada");

		}

	}
}