package aplicacao;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramEmp {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of taxpayers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Taxpayer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double anualIncome = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double he = sc.nextDouble();
                list.add(new Individual(name, anualIncome, he));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("\nTAXES PAID:");
        for (TaxPayer tp : list) {
            System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.tax()));
        }

        double sum = 0.0;
        for (TaxPayer tp : list) {
            sum += tp.tax();
        }

        System.out.println("Total taxes: $" + String.format("%.2f", sum));

        sc.close();
    }
}
