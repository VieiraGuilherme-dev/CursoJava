package entidades;

public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    // Construtor para inicializar o nome e as notas
    public Student(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }

    // Método para calcular a nota final
    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    // Método para calcular os pontos faltantes
    public double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }
    
    // Método toString para exibir informações do estudante
    @Override
    public String toString() {
        return "Student: " + name + "\n"
                + "Final Grade: " + String.format("%.2f", finalGrade()) + "\n"
                + (finalGrade() < 60.0 ? "FAILED" : "PASSED")
                + (finalGrade() < 60.0 ? "\nMissing Points: " + String.format("%.2f", missingPoints()) : "");
    }
}
