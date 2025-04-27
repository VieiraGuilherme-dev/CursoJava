// Pacote onde a classe está localizada
package entities;

// Importação da enumeração Color, que contém as cores possíveis para as formas
import entities.enums.Color;

// A classe Shape é uma classe abstrata, que serve como base para outras formas geométricas
public abstract class Shape {

    // Atributo que define a cor da forma
    private Color color;

    // Construtor padrão (sem parâmetros)
    public Shape() {
    }

    // Construtor que inicializa a cor da forma
    public Shape(Color color) {
        this.color = color; // Inicializa a cor da forma com o valor passado
    }

    // Getter para a cor da forma
    public Color getColor() {
        return color;
    }

    // Setter para a cor da forma
    public void setColor(Color color) {
        this.color = color;
    }

    // Método abstrato que deve ser implementado pelas subclasses
    // Cada forma (como o retângulo, círculo, etc.) deve calcular sua área de maneira específica
    public abstract double area();
}
