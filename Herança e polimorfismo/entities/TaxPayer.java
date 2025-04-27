// Pacote onde a classe está localizada
package entities;

// A classe Company estende (herda) a classe TaxPayer, que provavelmente representa um contribuinte genérico
public class Company extends TaxPayer {

    // Atributo que representa o número de funcionários da empresa
    private Integer numberOfEmployees;

    // Construtor que inicializa o nome, a renda anual e o número de funcionários
    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome); // Chama o construtor da classe mãe (TaxPayer) para inicializar o nome e a renda
        this.numberOfEmployees = numberOfEmployees; // Inicializa o número de funcionários
    }

    // Getter para o número de funcionários
    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    // Setter para o número de funcionários
    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    // Sobrescreve o método tax() da classe TaxPayer
    // O cálculo do imposto depende do número de funcionários
    @Override
    public double tax() {
        // Se o número de funcionários for maior que 10, aplica uma taxa de 14%
        if (numberOfEmployees > 10) {
            return getAnualIncome() * 0.14;
        }
        // Caso contrário, aplica uma taxa de 16%
        else {
            return getAnualIncome() * 0.16;
        }
    }
}
