// Pacote onde a classe está localizada
package entities;

// A classe Company herda de TaxPayer (pagador de impostos)
public class Company extends TaxPayer {
    
    // Número de empregados da empresa
    private Integer numberOfEmployees;

    // Construtor da classe Company, recebendo nome, renda anual e número de empregados
    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome); // Chama o construtor da superclasse TaxPayer
        this.numberOfEmployees = numberOfEmployees; // Inicializa o número de empregados
    }

    // Getter para o número de empregados
    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    // Setter para o número de empregados
    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    // Implementação do método abstrato tax() da superclasse
    @Override
    public double tax() {
        // Se a empresa tiver mais de 10 empregados, paga 14% de imposto
        if (numberOfEmployees > 10) {
            return getAnualIncome() * 0.14;
        }
        // Caso contrário, paga 16% de imposto
        else {
            return getAnualIncome() * 0.16;
        }
    }
}
