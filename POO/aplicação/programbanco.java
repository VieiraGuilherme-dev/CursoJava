package aplicação;

import java.util.Locale;
import java.util.Scanner;
import entidades.Conta;

public class programbanco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int numero = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter account holder: ");
        String nomeDoTitular = sc.nextLine();
        Conta conta;
        System.out.println("Is there an initial deposit (y/n)?");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double valorDeposito = sc.nextDouble();
            conta = new Conta(numero, nomeDoTitular, valorDeposito);
        } else {
            conta = new Conta(numero, nomeDoTitular);
        }
       
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(conta);
        
        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        conta.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(conta); 
        
        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        conta.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(conta); 


        sc.close();
    }
}
