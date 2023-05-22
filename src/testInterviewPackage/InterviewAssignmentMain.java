package testInterviewPackage;

import java.util.Scanner;

public class InterviewAssignmentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InterviewAssignment iA = new InterviewAssignment();

		String s;
		int k;
		System.out.println("Enter Current day of week");
		s = sc.nextLine();
		System.out.println("Enter no. of days from current day");
		k = sc.nextInt();

		System.out.println(
				"s = " + s + "\nk = " + k + "\nThe day of the week after " + k + " days= " + iA.findFutureDay(s, k));

	}

}
