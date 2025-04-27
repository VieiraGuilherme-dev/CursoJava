// Pacote onde a classe está localizada
package entities;

// A classe OutsourcedEmployee herda de Employee, portanto é uma especialização
public class OutsourcedEmployee extends Employee {
    
    // Taxa adicional para os empregados terceirizados
    private double additionalCharge;

    // Construtor padrão (sem parâmetros) 
    public OutsourcedEmployee() {
        super(); // Chama o construtor da superclasse Employee
    }

    // Construtor que inicializa o nome, horas trabalhadas, valor por hora e a taxa adicional
    public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour); // Chama o construtor da superclasse Employee
        this.additionalCharge = additionalCharge; // Inicializa a taxa adicional
    }

    // Getter para a taxa adicional
    public double getAdditionalCharge() {
        return additionalCharge;
    }

    // Setter para a taxa adicional
    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    // Sobrescreve o método payment da classe Employee para incluir o adicional
    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1; // Calcula o pagamento, somando a taxa adicional com 10% a mais
    }
}
