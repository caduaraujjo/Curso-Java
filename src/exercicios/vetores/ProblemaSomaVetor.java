package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
	
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero: ");
			double n2 = sc.nextDouble();
			vect[i] = n2;
		}
		
		System.out.printf("VALORES: ");
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("%.2f ", vect[i]);
		}
		
		double soma = 0;
		double media = 0;
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i];
			media = soma/n;
		}
		System.out.println();
		System.out.printf("SOMA: %.2f\n", soma);
		System.out.printf("MEDIA: %.2f\n", media);
		sc.close();
	}

}
