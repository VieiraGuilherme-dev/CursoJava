// Pacote de entidades
package entidades;

// Classe que representa um funcionário
public class Employee1 {
    private Integer Id; // Atributo para id do funcionário
    private String name; // Atributo para nome do funcionário
    private double salary; // Atributo para salário do funcionário

    // Construtor
    public Employee1(Integer id, String name, double salary) {
        super();
        Id = id;
        this.name = name;
        this.salary = salary;
    }

    // Métodos getters e setters
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    // Método para aumentar o salário com base em uma porcentagem
    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }

    // Método toString para exibir o funcionário no formato: id, nome, salário
    @Override
    public String toString() {
        return Id + "," + name + "," + String.format("%.2f", salary);
    }
}
