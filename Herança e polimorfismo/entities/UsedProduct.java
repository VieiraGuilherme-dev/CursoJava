// Pacote onde a classe está localizada
package entities;

import java.time.LocalDate; // Importa a classe LocalDate para lidar com datas
import java.time.format.DateTimeFormatter; // Importa a classe DateTimeFormatter para formatar datas

// A classe UsedProduct herda da classe Product, representando um produto usado
public class UsedProduct extends Product {

    // Atributo específico de um produto usado, que armazena a data de fabricação
    private LocalDate manufactureDate;

    // Construtor da classe que inicializa o nome, preço e data de fabricação do produto
    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price); // Chama o construtor da classe mãe (Product) para inicializar o nome e o preço
        this.manufactureDate = manufactureDate; // Inicializa a data de fabricação
    }

    // Getter para a data de fabricação
    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    // Setter para a data de fabricação
    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    // Sobrescreve o método priceTag() da classe Product para mostrar as informações de preço e data de fabricação
    @Override
    public String priceTag() {
        // Retorna uma string formatada com o nome, preço e data de fabricação do produto
        return getName()
                + " (used) $ " // Indica que o produto é usado
                + String.format("%.2f", getPrice()) // Exibe o preço formatado com 2 casas decimais
                + " (Manufacture date: " // Inicia a exibição da data de fabricação
                + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) // Formata a data de fabricação no padrão "dd/MM/yyyy"
                + ")"; // Finaliza a string de exibição
    }
}
