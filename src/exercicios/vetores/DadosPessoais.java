package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoais {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		double menorAltura = 0;
		double maiorAltura = 0;
		double mediaAltura = 0;
		double somaF = 0.0;
		int qtdF = 0;
		int qtdM = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa:", i+1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa:", i+1);
			genero[i] = sc.next().charAt(0);
			
			if (i == 0) {
			    menorAltura = altura[i];
			    maiorAltura = altura[i];
			}
			
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			
			if(maiorAltura < altura[i]) {
				maiorAltura = altura[i];
			}
			
			if(genero[i] == 'F') {
				somaF += altura[i];
				qtdF++;
			}
			
			if(genero[i] == 'M') {
				qtdM++;
			}	
		}
		
		mediaAltura = somaF / qtdF;
		
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAltura);
		System.out.printf("Numero de homens = %d\n", qtdM);
		sc.close();
	}

}
