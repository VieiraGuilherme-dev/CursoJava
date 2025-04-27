package entidades;

public class Rectangle {
    
    // Encapsulando as variáveis para garantir que só sejam modificadas de forma controlada
    private double width;
    private double height;

    // Construtores para inicializar o objeto com os valores de largura e altura
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getters e Setters para acessar e modificar a largura e altura de forma controlada
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Método para calcular a área do retângulo
    public double area() {
        return width * height;
    }

    // Método para calcular o perímetro do retângulo
    public double perimeter() {
        return 2 * (width + height);
    }

    // Método para calcular a diagonal do retângulo
    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }
}
