// Pacote onde a classe está localizada
package aplicação;

import java.util.Locale; // Importa a classe Locale para definir a localidade
import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário
import entidades.Rectangle; // Importa a classe Rectangle que será usada para calcular área, perímetro e diagonal

// Classe principal que executa a aplicação
public class programa {
    public static void main(String[] args) {

        // Define o padrão de localidade como Estados Unidos (para formatar os números corretamente)
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para ler entradas do usuário
        Scanner sc = new Scanner(System.in);

        // Cria um objeto Rectangle para armazenar as dimensões do retângulo
        Rectangle rect = new Rectangle();

        // Solicita ao usuário que insira a largura e a altura do retângulo
        System.out.println("Enter rectangle width and height:");

        // Lê os valores inseridos pelo usuário para a largura e altura do retângulo
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        // Calcula e exibe a área do retângulo chamando o método area() da classe Rectangle
        System.out.printf("AREA = %.2f%n", rect.area());

        // Calcula e exibe o perímetro do retângulo chamando o método perimeter() da classe Rectangle
        System.out.printf("Perimeter = %.2f%n", rect.perimeter());

        // Calcula e exibe a diagonal do retângulo chamando o método diagonal() da classe Rectangle
        System.out.printf("Diagonal = %.2f%n", rect.diagonal());

        // Fecha o scanner para liberar os recursos
        sc.close();
    }
}
