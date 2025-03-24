package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Employee1;

public class programArray {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee1> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered?: ");
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			System.out.println();
			System.out.println("Employee #" +(i+1)+ ":");
			System.out.print("id: ");
			Integer id=sc.nextInt();
			
			System.out.println("name: ");
			sc.nextLine();
			String name=sc.next();
			
			System.out.println("salary: ");
			double salary=sc.nextDouble();	
			
			Employee1 emp1 = new Employee1(id, name, salary);
			
			list.add(emp1);
		}	
		System.out.println("Enter the employee id that will have salary increase: ");
		int idSalary=sc.nextInt();
		Integer pos = position(list, idSalary);
		if(pos==null) {
			System.out.println("this id does not exist! ");
		}else {
			System.out.println("Enter the percentage: ");
			double percent=sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of Employees: ");
		for(Employee1 emp1 : list) {
			System.out.println(emp1);
		}
		
    }
	public static Integer position(List<Employee1> list, int id) {
		for (int i=0; i<list.size(); i++) {
			if(list.get(i).getId()==id) {
				return i;
			}
		}
		return null;
	}
}
