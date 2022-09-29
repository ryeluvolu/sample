import java.util.Scanner;

public class SalaryCalculation {

	public static void main(String[] args) {

		System.out.println("Enter number of hours worked per week: ");
		Scanner in = new Scanner(System.in);
		double totalHoursWorked = in.nextInt();

		System.out.println("Enter the pay per hour: ");
		Scanner sal = new Scanner(System.in);
		double salary = sal.nextInt();

		double totalSalary = calculateSalary(totalHoursWorked, salary);

		System.out.println("Your total pay of the week is: " + totalSalary);
		sal.close();
	}

	private static double calculateSalary(double totalHoursWorked, double salary) {
		double totalSalary;

		totalSalary = salary * totalHoursWorked;
		return totalSalary;
	}
}