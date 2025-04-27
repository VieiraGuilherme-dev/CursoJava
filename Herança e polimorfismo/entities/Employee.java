// Pacote onde a classe está localizada
package entities;

// Classe Employee representa um funcionário
public class Employee {
    
    // Atributos privados: nome, horas trabalhadas e valor por hora
    private String name;
    private Integer hours; // Pode ser 'int' para simplificar, mas Integer é útil se precisar de null
    private Double valuePerHour;

    // Construtor padrão (sem argumentos)
    public Employee() {
    }

    // Construtor com parâmetros para inicializar todos os atributos
    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    // Getter para o nome
    public String getName() {
        return name;
    }

    // Setter para o nome
    public void setName(String name) {
        this.name = name;
    }

    // Getter para horas trabalhadas
    public Integer getHours() {
        return hours;
    }

    // Setter para horas trabalhadas
    public void setHours(Integer hours) {
        this.hours = hours;
    }

    // Getter para valor por hora
    public Double getValuePerHour() {
        return valuePerHour;
    }

    // Setter para valor por hora
    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    // Método que calcula o pagamento: horas trabalhadas multiplicadas pelo valor da hora
    public double payment() {
        return hours * valuePerHour;
    }
}
