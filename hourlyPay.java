import java.util.Scanner;

public class hourlyPay {
	static Scanner scan = new Scanner(System.in);
	static int yearlySalary = 0;
	static int hourlySalary = 0;
	static int hoursWeek = 0;
	static int weeksYear = 0;

	public static void info() throws InterruptedException {
		System.out.println("\nWhat is your yearly salary? (50000 average)\n");
		System.out.print("Input answer here: ");
		yearlySalary = scan.nextInt();

		System.out.println("\nHow many weeks a year do you work? (52 average)\n");
		System.out.print("Input answer here: ");
		weeksYear = scan.nextInt();

		System.out.println("\nHow many hours a week do you work on average?(40 average)\n");
		System.out.print("Input answer here: ");
		hoursWeek = scan.nextInt();

		System.out.print("\n\n\nCalculating....\n\n\n");
		Thread.sleep(2000);

	}

	public static String calc() throws InterruptedException {
		info();
		int weeklySalary = (yearlySalary / weeksYear);
		hourlySalary = (weeklySalary / hoursWeek);

		return "You make $" + hourlySalary + " perHour\n\n\n\n";

	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println(calc());
	}

}
