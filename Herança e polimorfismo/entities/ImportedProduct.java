// Pacote onde a classe está localizada
package entities;

// A classe ImportedProduct herda da classe Product
public class ImportedProduct extends Product {

    // Taxa de importação
    private Double customsFee;

    // Construtor que inicializa nome, preço e taxa de importação
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price); // Chama o construtor da superclasse Product
        this.customsFee = customsFee; // Inicializa a taxa de importação
    }

    // Getter para a taxa de importação
    public Double getCustomsFee() {
        return customsFee;
    }

    // Setter para a taxa de importação
    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    // Método que retorna o preço total (preço base + taxa de importação)
    public Double totalPrice() {
        return getPrice() + customsFee;
    }

    // Sobrescreve o método priceTag da classe Product
    @Override
    public String priceTag() {
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice()) // Formata o preço total com duas casas decimais
                + " (Customs fee: $ "
                + String.format("%.2f", customsFee) // Exibe também a taxa de importação
                + ")";
    }
}
