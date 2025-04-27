// Pacote da aplicação
package aplicação;

// Importação das classes necessárias
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Employee1;

// Classe principal
public class programArray {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Define o padrão de localização para US (ponto como separador decimal)
        Scanner sc = new Scanner(System.in); // Cria o objeto Scanner para entrada de dados

        List<Employee1> list = new ArrayList<>(); // Cria uma lista de empregados

        System.out.println("How many employees will be registered?: ");
        int n = sc.nextInt(); // Lê o número de funcionários que serão cadastrados

        // Loop para cadastrar os funcionários
        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("id: ");
            Integer id = sc.nextInt(); // Lê o id do funcionário

            System.out.println("name: ");
            sc.nextLine(); // Limpa o buffer do Scanner
            String name = sc.next(); // Lê o nome do funcionário

            System.out.println("salary: ");
            double salary = sc.nextDouble(); // Lê o salário do funcionário

            // Cria um novo objeto Employee1 com os dados lidos
            Employee1 emp1 = new Employee1(id, name, salary);

            // Adiciona o funcionário à lista
            list.add(emp1);
        }

        // Solicita o id do funcionário que terá aumento de salário
        System.out.println("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

        Integer pos = position(list, idSalary); // Busca a posição do funcionário na lista

        if (pos == null) {
            System.out.println("this id does not exist! "); // Mensagem caso o id não exista
        } else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble(); // Lê a porcentagem de aumento
            list.get(pos).increaseSalary(percent); // Aplica o aumento
        }

        System.out.println();
        System.out.println("List of Employees: ");
        
        // Exibe a lista de funcionários
        for (Employee1 emp1 : list) {
            System.out.println(emp1);
        }

        sc.close(); // Fecha o Scanner (boa prática)
    }

    // Método para encontrar a posição do funcionário pelo id
    public static Integer position(List<Employee1> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i; // Retorna a posição se encontrado
            }
        }
        return null; // Retorna null se não encontrado
    }
}
