package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados?");
		int n = sc.nextInt();
		
		String [] nome = new String [n];
		double [] nota1 = new double [n];
		double [] nota2 = new double[n];
		double [] soma = new double[n];
		double [] media = new double[n];
		
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:", i+1);
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
			soma[i] = nota1[i] + nota2[i];
			media[i] = soma[i] / 2;
		}
		
		System.out.println("Alunos aprovados:");
		for(int i = 0; i < n; i++) {
			if(media[i] >= 6) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}

}
