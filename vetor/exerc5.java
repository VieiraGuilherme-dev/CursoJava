package aplicação;

import java.util.Locale;
import java.util.Scanner;

public class exerc5vetor {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		double soma, media;
		System.out.println("Quantos numeros voce vai digitar?: ");
		n=sc.nextInt();
		
		double[] vect = new double[n];
		for(int i=0; i<vect.length; i++) {
			System.out.println("Digite um numero: ");
			vect[i]=sc.nextDouble();
		}
		
		soma=0;
		for(int i=0; i<vect.length; i++) {
			soma=soma+vect[i];
		}
		media=soma/n;
		System.out.printf("Media do vetor: ", media);
		System.out.println("elementos abaixo da media: ");
		for(int i=0; i<vect.length; i++) {
			if(vect[i]<media) {
				System.out.printf("%.1f\n", vect[i]);
			}
			
		}

}
}
