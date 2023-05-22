package testInterviewPackage;

import java.util.ArrayList;
import java.util.List;

public class InterviewAssignment {

	public String findFutureDay(String day, int k) {
		int currentDayIndex;
		int futureDayIndex;
		List<String> weekDays = new ArrayList<>();
		weekDays.add("Mon");
		weekDays.add("Tue");
		weekDays.add("Wed");
		weekDays.add("Thu");
		weekDays.add("Fri");
		weekDays.add("Sat");
		weekDays.add("Sun");
		currentDayIndex = weekDays.indexOf(day);
		futureDayIndex = (currentDayIndex + k) % 7;

		return weekDays.get(futureDayIndex);
	}

}