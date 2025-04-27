// Pacote onde a classe está localizada
package entities;

// Importação da enumeração de cores
import entities.enums.Color;

// A classe Circle herda da classe Shape
public class Circle extends Shape {
    // Atributo privado específico do círculo: raio
    private Double radius;

    // Construtor padrão (sem argumentos)
    public Circle() {
        super(); // Chama o construtor da superclasse Shape
    }

    // Construtor com argumentos para cor e raio
    public Circle(Color color, Double radius) {
        super(color); // Chama o construtor da superclasse, atribuindo a cor
        this.radius = radius; // Define o raio
    }

    // Getter para o raio
    public Double getRadius() {
        return radius;
    }

    // Setter para o raio
    public void setRadius(Double radius) {
        this.radius = radius;
    }

    // Implementação obrigatória do método abstrato area() da classe Shape
    @Override
    public double area() {
        // Fórmula da área do círculo: π * raio²
        return Math.PI * radius * radius;
    }
}
