package model.exceptions;

import model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        // Usando File.separator para compatibilidade com diferentes sistemas operacionais
        File success = new File(sourceFolderStr + File.separator + "out");
        
        // Verifica se a pasta de saída já existe, caso contrário, cria
        if (!success.exists()) {
            success.mkdirs(); // cria a pasta "out" e qualquer diretório necessário
        }

        String targetFileStr = success.getPath() + File.separator + "summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                String[] fields = itemCsv.split(",");
                try {
                    String name = fields[0];
                    double price = Double.parseDouble(fields[1]);
                    int quantity = Integer.parseInt(fields[2]);

                    list.add(new Product(name, price, quantity));
                } catch (NumberFormatException e) {
                    System.out.println("Error parsing data: " + e.getMessage());
                }
                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Product item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }
                System.out.println(targetFileStr + " created.");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();  // Garante que o Scanner seja fechado
        }
    }
}

