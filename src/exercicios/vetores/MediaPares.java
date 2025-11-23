package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		int pares = 0;
		int qtdPares = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			if(vect[i] % 2 == 0) {
				pares += vect[i];
				qtdPares++;
			}
		}
		
		if(pares > 0) {
			double media = pares / qtdPares;
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
		
	}

}
