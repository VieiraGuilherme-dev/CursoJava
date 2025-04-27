package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) throws ParseException {

        // Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Criação de um mapa para armazenar os votos de cada candidato (nome do candidato como chave e votos como valor)
        Map<String, Integer> votes = new LinkedHashMap<>();

        // Solicita ao usuário o caminho completo do arquivo
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        // Tenta ler o arquivo e processar os dados
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // Lê cada linha do arquivo
            String line = br.readLine();
            while (line != null) {

                // Divide a linha pelo delimitador vírgula (assumindo que o formato do arquivo é "nome,votos")
                String[] fields = line.split(",");
                String name = fields[0]; // Nome do candidato
                int count = Integer.parseInt(fields[1]); // Quantidade de votos

                // Verifica se o candidato já tem votos registrados no mapa
                if (votes.containsKey(name)) {
                    // Se já tem votos, soma os novos votos
                    int votesSoFar = votes.get(name);
                    votes.put(name, count + votesSoFar);
                }
                else {
                    // Se não tem votos, adiciona o nome com a quantidade de votos
                    votes.put(name, count);
                }

                // Lê a próxima linha do arquivo
                line = br.readLine();
            }

            // Exibe os votos totais de cada candidato
            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (IOException e) {
            // Caso ocorra algum erro ao ler o arquivo
            System.out.println("Error: " + e.getMessage());
        }

        // Fecha o scanner para liberar o recurso
        sc.close();
    }
}
