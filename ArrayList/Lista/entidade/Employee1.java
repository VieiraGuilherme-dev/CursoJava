package entidades;

public class Employee1 {
	private Integer Id;
	private String name;
	private double salary;
	public Employee1(Integer id, String name, double salary) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
	}
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
	public void increaseSalary(double percentage){
		salary += salary * percentage / 100.0; 
	}
	public String toString() {
		return Id + "," +name+ "," +String.format("%.2f", salary);	
		}
}
