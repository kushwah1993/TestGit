package java8_Assignment;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Assignment5 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now(); 
        System.out.println("The current date is "+ date); 
        
        LocalDate secondSundayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth())
        		.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY))
        		.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));    
        System.out.println("Second Sunday Of Next Month : " +secondSundayOfNextMonth); 
	}

}
