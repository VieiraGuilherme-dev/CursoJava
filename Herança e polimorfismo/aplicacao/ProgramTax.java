// Pacote da aplicação
package aplicacao;

// Importação das entidades necessárias
import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe principal
public class ProgramEmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria o Scanner para entrada de dados
        List<TaxPayer> list = new ArrayList<>(); // Lista de contribuintes (polimórfica)

        System.out.print("Enter the number of taxpayers: ");
        int n = sc.nextInt(); // Lê o número de contribuintes

        // Loop para entrada de dados de cada contribuinte
        for (int i = 1; i <= n; i++) {
            System.out.println("Taxpayer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0); // Lê o tipo de contribuinte: pessoa física ou empresa

            sc.nextLine(); // Limpa o buffer do Scanner

            System.out.print("Name: ");
            String name = sc.nextLine(); // Lê o nome do contribuinte

            System.out.print("Annual income: ");
            double anualIncome = sc.nextDouble(); // Lê a renda anual

            // Verifica se é uma pessoa física
            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double he = sc.nextDouble(); // Lê os gastos com saúde
                list.add(new Individual(name, anualIncome, he)); // Adiciona um indivíduo à lista
            } else { // Se for uma empresa
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt(); // Lê o número de funcionários
                list.add(new Company(name, anualIncome, numberOfEmployees)); // Adiciona uma empresa à lista
            }
        }

        System.out.println();
        System.out.println("\nTAXES PAID:");
        // Calcula e mostra o imposto de cada contribuinte
        for (TaxPayer tp : list) {
            System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.tax())); // Polimorfismo: chama o tax() correto
        }

        double sum = 0.0; // Variável para somar o total de impostos
        for (TaxPayer tp : list) {
            sum += tp.tax(); // Soma o imposto de cada contribuinte
        }

        System.out.println("Total taxes: $" + String.format("%.2f", sum)); // Exibe o total de impostos

        sc.close(); // Fecha o Scanner (boa prática)
    }
}
