package entidades;

public class Employee {

    // Variáveis privadas, para garantir o encapsulamento
    private String name;
    private double grossSalary;
    private double tax;

    // Construtor para inicializar as variáveis de instância
    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    // Getters e Setters para acessar e modificar os valores
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    // Método para calcular o salário líquido
    public double netSalary() {
        return grossSalary - tax;
    }

    // Método para aumentar o salário com base em um percentual
    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }

    // Método para retornar uma string formatada com o nome e o salário líquido
    @Override
    public String toString() {
        return name + ", $" + String.format("%.2f", netSalary());
    }
}
