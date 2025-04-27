package matrizapplication;

import java.util.Scanner;

public class application2 {
    public static void main(String[] args) {
        // Scanner para ler a entrada de dados do usuário
        Scanner sc = new Scanner(System.in);

        // Lê as dimensões da matriz (número de linhas e colunas)
        int n = sc.nextInt();  // número de colunas
        int m = sc.nextInt();  // número de linhas

        // Cria a matriz com m linhas e n colunas
        int[][] mat = new int[m][n];

        // Preenche a matriz com os números fornecidos pelo usuário
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {  // Corrigido: a iteração sobre as colunas deve ser `mat[i].length`
                mat[i][j] = sc.nextInt();
            }
        }

        // Lê o valor x que será procurado na matriz
        int x = sc.nextInt();

        // Procura o valor x na matriz
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {  // Corrigido: a iteração sobre as colunas deve ser `mat[i].length`
                // Se encontrar o valor x, imprime a posição e os elementos ao redor
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    
                    // Verifica se existe um elemento à esquerda
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }

                    // Verifica se existe um elemento acima
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }

                    // Verifica se existe um elemento à direita
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }

                    // Verifica se existe um elemento abaixo
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }

        // Fecha o scanner
        sc.close();
    }
}
