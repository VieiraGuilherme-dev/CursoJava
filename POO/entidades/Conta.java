package entidades;

public class Conta {
    private int numero;
    private String nomeDoTitular;
    private double valorDeposito;

    // Construtor sem depósito inicial
    public Conta(int numero, String nomeDoTitular) {
        this.numero = numero;
        this.nomeDoTitular = nomeDoTitular;
    }

    // Construtor com depósito inicial
    public Conta(int numero, String nomeDoTitular, double inicialDeposito) {
        this.numero = numero;
        this.nomeDoTitular = nomeDoTitular;
        deposit(inicialDeposito); // Chama o método deposit para adicionar o depósito inicial
    }

    // Getters e setters
    public int getNumero() {
        return numero;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public double getValorDeposito() {
        return valorDeposito;
    }

    // Método para realizar depósitos
    public void deposit(double amount) {
        if (amount > 0) {
            valorDeposito += amount; // Adiciona o valor ao saldo
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Método para realizar saques
    public void withdraw(double amount) {
        if (amount > 0 && valorDeposito >= amount + 5.0) {
            valorDeposito -= (amount + 5.0); // Deduz o valor do saque mais a taxa de 5
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Método para exibir os dados da conta
    public String toString() {
        return "Account: "
                + numero
                + ", Holder: "
                + nomeDoTitular
                + ", Balance: $"
                + String.format("%.2f", valorDeposito);
    }
}
