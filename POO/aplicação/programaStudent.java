// Pacote onde a classe está localizada
package aplicação;

// Importações necessárias
import java.util.Locale; // Para definir o formato de números com base na localidade
import java.util.Scanner; // Para ler entradas do usuário
import entidades.Employee; // Importa a classe Employee, onde são armazenados os dados do funcionário

// Classe principal da aplicação
public class program {
    public static void main(String[] args) {
        // Define o padrão de localidade como US, ajustando o formato de números
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner para capturar entradas do usuário
        Scanner sc = new Scanner(System.in);
        
        // Cria um objeto Employee para armazenar as informações do funcionário
        Employee emp = new Employee();
        
        // Solicita e lê o nome do funcionário
        System.out.println("Name: ");
        emp.name = sc.nextLine();
        
        // Solicita e lê o salário bruto do funcionário
        System.out.println("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        
        // Solicita e lê a taxa de imposto do funcionário
        System.out.println("tex: ");
        emp.tax = sc.nextDouble();
        
        // Exibe as informações iniciais do funcionário
        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        
        // Solicita ao usuário o percentual para aumento do salário
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        
        // Aplica o aumento no salário
        emp.increaseSalary(percentage);
        
        // Exibe os dados do funcionário com o salário atualizado
        System.out.println();
        System.out.println("Updated data:" + emp);
        
        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}
