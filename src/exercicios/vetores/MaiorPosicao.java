package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double [] vect = new double[n];
		double highValue = 0.0;
		int position = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect [i] = sc.nextDouble();
			
			if(vect[i] > highValue) {
				highValue = vect[i];
				position = i;
			}
			
		}
		
		System.out.printf("Maior valor = %.2f\n", highValue);
		System.out.println("Posição do maior valor = " + position);
		sc.close();
	}

}
