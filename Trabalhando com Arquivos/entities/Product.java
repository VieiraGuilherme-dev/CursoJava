package model.entities;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;

    // Construtor
    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    // Método que calcula o valor total do produto
    public Double total() {
        return price * quantity;
    }

    // Método toString para facilitar a exibição das informações
    @Override
    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", Quantity: " + quantity;
    }
}
