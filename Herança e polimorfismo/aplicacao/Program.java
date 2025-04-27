// Pacote da aplicação
package application;

// Importação das bibliotecas necessárias
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

// Classe principal
public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US); // Define o padrão de localização para US (ponto como separador decimal)
        Scanner sc = new Scanner(System.in); // Cria o Scanner para entrada de dados

        List<Product> list = new ArrayList<>(); // Cria uma lista de produtos

        System.out.print("Entre com o numero de produtos: ");
        int n = sc.nextInt(); // Lê o número de produtos

        // Loop para cadastrar os produtos
        for (int i = 1; i <= n; i++) {
            System.out.println("Datos do produto #" + i + ":");
            System.out.print("Comum, usado, importado (c/u/i)? ");
            char type = sc.next().charAt(0); // Lê o tipo de produto

            System.out.print("Nome: ");
            sc.nextLine(); // Limpa o buffer do Scanner
            String name = sc.nextLine(); // Lê o nome do produto

            System.out.print("Preco: ");
            double price = sc.nextDouble(); // Lê o preço do produto

            // Verifica o tipo de produto e instancia o objeto correspondente
            if (type == 'c') {
                list.add(new Product(name, price)); // Produto comum
            }
            else if (type == 'u') {
                System.out.print("Data de fabricacao (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy")); // Lê e converte a data
                list.add(new UsedProduct(name, price, date)); // Produto usado
            }
            else {
                System.out.print("Taxa de importacao: ");
                double customsFee = sc.nextDouble(); // Lê a taxa de importação
                list.add(new ImportedProduct(name, price, customsFee)); // Produto importado
            }
        }

        System.out.println();
        System.out.println("ETIQUETAS DE PRECO:");
        
        // Exibe as etiquetas de preço de todos os produtos
        for (Product prod : list) {
            System.out.println(prod.priceTag()); // Chama o método priceTag, que pode ser sobrescrito nas subclasses
        }

        sc.close(); // Fecha o Scanner (boa prática)
    }
}

