package aplicação;

import java.util.Locale;
import java.util.Scanner;
import entidades.Conta;

public class programbanco {
    public static void main(String[] args) {
        // Configura o local para o formato correto de números com ponto (US)
        Locale.setDefault(Locale.US);
        // Criação do objeto scanner para ler os dados de entrada
        Scanner sc = new Scanner(System.in);

        // Entrada do número da conta
        System.out.println("Enter account number: ");
        int numero = sc.nextInt();
        sc.nextLine();  // Consome a quebra de linha pendente
        // Entrada do nome do titular da conta
        System.out.println("Enter account holder: ");
        String nomeDoTitular = sc.nextLine();

        // Variável para armazenar a conta
        Conta conta;

        // Pergunta se o usuário deseja fazer um depósito inicial
        System.out.println("Is there an initial deposit (y/n)?");
        char response = sc.next().charAt(0);

        // Se o usuário responder 'y', cria a conta com o valor de depósito inicial
        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double valorDeposito = sc.nextDouble();
            conta = new Conta(numero, nomeDoTitular, valorDeposito);  // Cria a conta com depósito inicial
        } else {
            // Caso contrário, cria a conta sem depósito inicial
            conta = new Conta(numero, nomeDoTitular);
        }
       
        // Exibe os dados da conta
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(conta);
        
        // Entrada para depósito adicional
        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        conta.deposit(depositValue);  // Realiza o depósito na conta
        System.out.println("Updated account data: ");
        System.out.println(conta);  // Exibe os dados da conta após o depósito
        
        // Entrada para saque
        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        conta.withdraw(withdrawValue);  // Realiza o saque na conta
        System.out.println("Updated account data: ");
        System.out.println(conta);  // Exibe os dados da conta após o saque

        // Fecha o scanner para liberar recursos
        sc.close();
    }
}
