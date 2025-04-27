// Pacote onde a classe está localizada
package entities;

// Importação da classe Color que provavelmente é uma enumeração com as cores
import entities.enums.Color;

// A classe Rectangle herda de Shape, portanto é uma especialização de uma forma geométrica
public class Rectangle extends Shape {

    // Largura do retângulo
    private Double width;
    
    // Altura do retângulo
    private Double height;

    // Construtor padrão (sem parâmetros)
    public Rectangle() {
        super(); // Chama o construtor da superclasse Shape
    }

    // Construtor que inicializa a cor, largura e altura do retângulo
    public Rectangle(Color color, Double width, Double height) {
        super(color); // Chama o construtor da superclasse Shape para inicializar a cor
        this.width = width;  // Inicializa a largura
        this.height = height; // Inicializa a altura
    }

    // Getter para a largura
    public Double getWidth() {
        return width;
    }

    // Setter para a largura
    public void setWidth(Double width) {
        this.width = width;
    }

    // Getter para a altura
    public Double getHeight() {
        return height;
    }

    // Setter para a altura
    public void setHeight(Double height) {
        this.height = height;
    }

    // Sobrescreve o método area() da classe Shape para calcular a área do retângulo
    @Override
    public double area() {
        return width * height; // A área de um retângulo é dada pela largura * altura
    }
}
