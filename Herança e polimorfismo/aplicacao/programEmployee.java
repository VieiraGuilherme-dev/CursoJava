package aplicacao;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramEmp {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            System.out.println("Employee #" +i+ "data: ");
            System.out.println("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Hours: ");
            double hours = sc.nextInt();
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if(ch == 'y'){
                System.out.println("Additional charge: ");
                double addicionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, addicionalCharge);
                list.add(emp);
            }
            else{
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }
        System.out.println();
        System.out.println("Payments");
        for(Employee emp : list){
            System.out.println(emp.getName() + " - $ " +String.format("%.2f", emp.payment()));
        }
    }
}
