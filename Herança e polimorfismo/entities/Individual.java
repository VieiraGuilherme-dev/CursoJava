// Pacote onde a classe está localizada
package entities;

// A classe Individual herda da classe TaxPayer
public class Individual extends TaxPayer {
    
    // Despesas com saúde
    private double healthExpenditures;

    // Construtor que inicializa nome, renda anual e despesas com saúde
    public Individual(String name, Double anualIncome, double healthExpenditures) {
        super(name, anualIncome); // Chama o construtor da superclasse TaxPayer
        this.healthExpenditures = healthExpenditures; // Inicializa as despesas com saúde
    }

    // Getter para despesas com saúde
    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    // Setter para despesas com saúde
    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    // Sobrescreve o método tax() da superclasse TaxPayer
    @Override
    public double tax() {
        double basicTax; // Imposto básico calculado com base na renda anual

        // Se a renda anual for menor que 20000, imposto é 15%
        if (getAnualIncome() < 20000.0) {
            basicTax = getAnualIncome() * 0.15;
        } else { // Caso contrário, imposto é 25%
            basicTax = getAnualIncome() * 0.25;
        }

        // Deduz 50% do valor das despesas com saúde
        basicTax -= getHealthExpenditures() * 0.5;

        // Se o imposto final for negativo, considera zero
        if (basicTax < 0.0) {
            basicTax = 0.0;
        }

        return basicTax; // Retorna o valor final do imposto
    }
}
