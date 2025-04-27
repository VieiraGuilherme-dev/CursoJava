// Pacote onde a classe está localizada
package aplicação;

// Importações necessárias
import java.util.Locale; // Para ajustar a localidade e formato de números
import java.util.Scanner; // Para ler entradas do usuário
import entidades.Student; // Importa a classe Student, que deve conter os métodos e atributos relacionados ao aluno

// Classe principal da aplicação
public class Program3 {
    public static void main(String[] args) {
        // Define o padrão de localidade como US, o que ajusta o formato de números
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner para capturar entradas do usuário
        Scanner sc = new Scanner(System.in);
        
        // Cria um objeto Student para armazenar as informações do aluno
        Student student = new Student();
        
        // Solicita e lê o nome do aluno
        System.out.println("Digite seu nome: ");
        student.name = sc.nextLine();
        
        // Solicita e lê as três notas do aluno
        System.out.println("Digite a primeira nota: ");
        student.grade1 = sc.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        student.grade2 = sc.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        student.grade3 = sc.nextDouble();
        
        // Exibe a nota final do aluno, formatada para 2 casas decimais
        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
        
        // Verifica se o aluno foi aprovado ou reprovado
        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED"); // Caso a nota final seja inferior a 60
            // Exibe os pontos faltando para o aluno alcançar a nota 60
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        } else {
            System.out.println("PASS"); // Caso a nota final seja 60 ou superior
        }
        
        // Fecha o Scanner para liberar os recursos
        sc.close();
    }
}
