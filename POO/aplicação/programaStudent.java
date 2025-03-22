package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidades.Employee;

public class program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("Name: ");
		emp.name=sc.nextLine();
		
		System.out.println("Gross Salary: ");
		emp.grossSalary=sc.nextDouble();
		
		System.out.println("tex: ");
		emp.tax=sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage =sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data:" +emp);
		sc.close();
		
 }
}
