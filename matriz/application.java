package matrizapplication;

import java.util.Scanner;

public class application {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite a quantidade de linhas e colunas: ");
		
		int n = sc.nextInt();
		int [][] mat = new int[n][n];
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Main diagonal: ");
		for(int i=0; i<mat.length; i++) {
			System.out.println(mat[i][i] + " ");
			
		}
		System.out.println();
		
		int count = 0;
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.printf("negative numbers:" + count);
		
	}
}
