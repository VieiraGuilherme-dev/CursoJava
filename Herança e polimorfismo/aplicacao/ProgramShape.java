// Pacote da aplicação
package aplicacao;

// Importação das classes necessárias
import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe principal
public class programshape {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Cria o Scanner para entrada de dados

        List<Shape> list = new ArrayList<>(); // Cria uma lista de formas geométricas (polimórfica)

        System.out.println("Enter the number of shapes");
        int n = sc.nextInt(); // Lê o número de formas a serem cadastradas

        // Loop para entrada de dados de cada forma
        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.println("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0); // Lê o tipo de forma: retângulo ou círculo

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color;
            // Loop para garantir que a cor digitada seja válida
            while (true) {
                try {
                    color = Color.valueOf(sc.next().trim().toUpperCase()); // Converte a entrada para Enum Color
                    break; // Sai do loop se a cor for válida
                } catch (IllegalArgumentException e) {
                    System.out.print("Invalid color! Please enter BLACK, BLUE, or RED: ");
                }
            }

            // Verifica se é retângulo
            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble(); // Lê a largura
                System.out.print("Height: ");
                double heigth = sc.nextDouble(); // Lê a altura
                list.add(new Rectangle(color, width, heigth)); // Adiciona um novo retângulo na lista
            } 
            else { // Caso contrário, é círculo
                System.out.print("Radius: ");
                double radius = sc.nextDouble(); // Lê o raio
                list.add(new Circle(color, radius)); // Adiciona um novo círculo na lista
            }
        }

        System.out.println();
        System.out.println("Shape areas: ");
        // Percorre a lista e imprime a área de cada forma
        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area())); // Chama o método polimórfico area()
        }

        sc.close(); // Fecha o Scanner (boa prática)
    }
}
