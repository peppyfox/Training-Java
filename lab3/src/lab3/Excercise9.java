package lab3;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author meenu
 * Lab3
 * q9
 * Create a method to accept date and print the duration in days, months and years
 *
 */
public class Excercise9 {

	public Excercise9()
	{
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a date");
		String textdate =sc.next();
		LocalDate date = LocalDate.parse(textdate,format);
		LocalDate todayDate = LocalDate.now();
		Period period = date.until(todayDate);
		System.out.println("Days Duration : "+period.getDays()+" days");
		System.out.println("Months Duration :"+period.getMonths()+"months");
		System.out.println("Years Duration :"+period.getYears()+"years");
	}

	public static void main(String[] args)
	{
		Excercise9 x = new Excercise9();

	}

}
