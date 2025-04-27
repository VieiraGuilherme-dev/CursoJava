package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

    public static void main(String[] args) {

        // Scanner para ler a entrada do usuário (caminho do arquivo)
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário o caminho completo do arquivo de log
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        // Tenta abrir o arquivo para leitura
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // Cria um conjunto (Set) para armazenar entradas de log únicas
            Set<LogEntry> set = new HashSet<>();

            // Lê cada linha do arquivo
            String line = br.readLine();
            while (line != null) {

                // Divide a linha em campos (usuário e data) usando espaço como delimitador
                String[] fields = line.split(" ");
                
                // O primeiro campo é o nome de usuário
                String username = fields[0];
                
                // O segundo campo é a data, que é convertida de String para Instant
                // Em seguida, converte Instant para Date
                Date moment = Date.from(Instant.parse(fields[1]));

                // Cria uma nova LogEntry e a adiciona ao conjunto
                set.add(new LogEntry(username, moment));

                // Lê a próxima linha do arquivo
                line = br.readLine();
            }

            // Exibe o número total de usuários únicos
            System.out.println("Total users: " + set.size());

        } catch (IOException e) {
            // Caso ocorra um erro na leitura do arquivo, exibe a mensagem de erro
            System.out.println("Error: " + e.getMessage());
        }
        
        // Fecha o Scanner para liberar o recurso
        sc.close();
    }
}
