package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double soma = 0;
		double media = 0;
		double abaixoMedia = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
			media = soma / n;
		}
		
		System.out.println("MEDIA DO VETOR = " + media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i < n; i++) {
			if(vect[i] < media) {
				abaixoMedia = vect[i];
				System.out.printf("%.1f\n", abaixoMedia);
			}
		}
		sc.close();
		

	}

}
