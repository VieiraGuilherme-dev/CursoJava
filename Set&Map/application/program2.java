package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program2 {
    public static void main(String[] args){
        // Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Criação de três conjuntos (sets) para armazenar os números dos alunos dos cursos A, B e C
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        // Pergunta para o usuário quantos alunos estão no curso A
        System.out.println("How many students for course A?: ");
        int n = sc.nextInt();

        // Loop para ler os números dos alunos do curso A e adicioná-los no conjunto "a"
        for(int i=0; i<n; i++){
            int number = sc.nextInt();
            a.add(number);
        }

        // Pergunta para o usuário quantos alunos estão no curso B
        System.out.println("How many students for course B?: ");
        n = sc.nextInt();

        // Loop para ler os números dos alunos do curso B e adicioná-los no conjunto "b"
        for(int i=0; i<n; i++){
            int number = sc.nextInt();
            b.add(number);
        }

        // Pergunta para o usuário quantos alunos estão no curso C
        System.out.println("How many students for course C?: ");
        n = sc.nextInt();

        // Loop para ler os números dos alunos do curso C e adicioná-los no conjunto "c"
        for(int i=0; i<n; i++){
            int number = sc.nextInt();
            c.add(number);
        }

        // Criação de um novo conjunto "total" que irá armazenar todos os alunos dos cursos B e C
        Set<Integer> total = new HashSet<>();

        // Adiciona todos os alunos de B e C no conjunto "total"
        total.addAll(b);
        total.addAll(c);

        // Exibe o número total de alunos únicos nos cursos B e C
        System.out.println("Total students: " + total.size());

        // Fecha o scanner para liberar o recurso
        sc.close();
    }
}
