// Pacote onde a classe está localizada
package entities;

// A classe Product representa um produto com nome e preço
public class Product {

    // Nome do produto
    private String name;
    
    // Preço do produto
    private Double price;

    // Construtor que inicializa nome e preço do produto
    public Product(String name, Double price) {
        this.name = name; // Inicializa o nome do produto
        this.price = price; // Inicializa o preço do produto
    }

    // Getter para o nome do produto
    public String getName() {
        return name;
    }

    // Setter para o nome do produto
    public void setName(String name) {
        this.name = name;
    }

    // Getter para o preço do produto
    public Double getPrice() {
        return price;
    }

    // Setter para o preço do produto
    public void setPrice(Double price) {
        this.price = price;
    }

    // Método para exibir a etiqueta de preço do produto, formatado
    public String priceTag() {
        return name // Nome do produto
                + " $ " // Sinal de dólar
                + String.format("%.2f", price); // Preço formatado com 2 casas decimais
    }
}
