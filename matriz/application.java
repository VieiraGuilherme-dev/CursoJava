package matrizapplication;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        // Scanner para ler os dados de entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário o tamanho da matriz (número de linhas e colunas)
        System.out.println("Digite a quantidade de linhas e colunas: ");
        int n = sc.nextInt();  // Lê o tamanho da matriz (n x n)

        // Criação de uma matriz quadrada de tamanho n x n
        int[][] mat = new int[n][n];

        // Preenchimento da matriz com os valores fornecidos pelo usuário
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();  // Lê cada elemento da matriz
            }
        }

        // Exibe a diagonal principal da matriz (elementos mat[i][i])
        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][i] + " ");  // Exibe os elementos da diagonal principal
        }
        System.out.println();

        // Contagem dos números negativos na matriz
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {  // Se o número for negativo
                    count++;  // Incrementa a contagem
                }
            }
        }

        // Exibe a quantidade de números negativos encontrados
        System.out.printf("negative numbers: " + count);

        // Fecha o scanner
        sc.close();
    }
}
