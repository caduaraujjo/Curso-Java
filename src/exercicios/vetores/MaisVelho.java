package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar?");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		int mIdade = 0;
		int posicao = 0;
		for(int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa: \n", i + 1);
			System.out.println("Nome: ");
			nome[i] = sc.next();
			System.out.println("Idade: ");
			idade[i] = sc.nextInt();
			
			if(idade[i] > mIdade) {
				mIdade = idade[i];
				posicao = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nome[posicao]);
		sc.close();

	}

}
