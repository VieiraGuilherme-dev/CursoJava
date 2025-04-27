// Pacote da aplicação
package aplicacao;

// Importação das entidades necessárias
import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe principal
public class ProgramEmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria o Scanner para entrada de dados
        List<Employee> list = new ArrayList<>(); // Lista de empregados (usando polimorfismo)

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt(); // Lê o número de funcionários

        // Loop para entrada dos dados de cada funcionário
        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.println("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0); // Verifica se o funcionário é terceirizado

            System.out.println("Name: ");
            sc.nextLine(); // Limpa o buffer do Scanner
            String name = sc.nextLine(); // Lê o nome do funcionário

            System.out.println("Hours: ");
            double hours = sc.nextInt(); // Lê o número de horas trabalhadas

            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble(); // Lê o valor por hora

            // Se for terceirizado
            if (ch == 'y') {
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble(); // Lê a taxa adicional
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge); // Cria um empregado terceirizado
                list.add(emp); // Adiciona na lista
            }
            // Se for empregado comum
            else {
                Employee emp = new Employee(name, hours, valuePerHour); // Cria um empregado comum
                list.add(emp); // Adiciona na lista
            }
        }

        System.out.println();
        System.out.println("Payments");
        // Imprime o pagamento de cada funcionário
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment())); // Usa polimorfismo para calcular o pagamento
        }

        sc.close(); // Fecha o Scanner (boa prática)
    }
}
