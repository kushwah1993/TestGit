package java8_Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;

public class Assignment6 {
	public static void main(String[] args) throws IOException {
		LocalDate today = LocalDate.now();
		
		System.out.println("Date of Joining");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Day of month:");
		int dayOfMonth = Integer.parseInt(br.readLine());
		System.out.println("Enter month:");
		int month = Integer.parseInt(br.readLine());
		System.out.println("Enter Year:");
		int year = Integer.parseInt(br.readLine());
		LocalDate doj = LocalDate.of(year, month, dayOfMonth);
		
		Period p = Period.between(doj, today);

		System.out.println("Completed " + p.getYears() + " years, " + p.getMonths() + " months, and " + p.getDays()+ " days");
	}
}
