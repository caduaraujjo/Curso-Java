package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaNegativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar?");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("Digite um numero: ");
			int n2 = sc.nextInt();
			vect[i] = n2;
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}

}
