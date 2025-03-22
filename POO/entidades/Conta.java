package entidades;

public class Conta {
    private int numero;
    private String nomeDoTitular;
    private double valorDeposito;

    public Conta(int numero, String nomeDoTitular) {
        this.numero = numero;
        this.nomeDoTitular = nomeDoTitular;
    }
    public Conta(int numero, String nomeDoTitular, double inicialDeposito) {
        this.numero = numero;
        this.nomeDoTitular = nomeDoTitular;
        deposit(inicialDeposito); 
    }

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
    public void deposit(double amount) {
        if (amount > 0) {
            valorDeposito += amount; 
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && valorDeposito >= amount + 5.0) {
            valorDeposito -= (amount + 5.0);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    public String toString() {
        return "Account: "
                + numero
                + ", Holder: "
                + nomeDoTitular
                + ", Balance: $"
                + String.format("%.2f", valorDeposito);
    }
	public void deposito(double depositValue) {
		
		
	}		
}
