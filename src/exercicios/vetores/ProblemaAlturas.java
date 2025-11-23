package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAlturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] vName = new String[n];
		int[] vAge = new int[n];
		Double[] vHeight = new Double[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			String name = sc.next();
			vName[i] = name;
			System.out.print("Idade: ");
			int age = sc.nextInt();
			vAge[i] = age;
			System.out.print("Altura: ");
			Double height = sc.nextDouble();
			vHeight[i] = height;
		}
		
		Double average = 0.0;
		Double avg = 0.0;
		for(int i=0; i<vName.length; i++) {
			average += vHeight[i];
			avg = average / n;
		}
		
		int people = 0;
		String peopleName = "";
		for(int i=0; i<vName.length; i++) {
			if(vAge[i] < 16) {
				people += 1;
				peopleName += vName[i] + " ";
			}
		}
		double percent = (people * 100) / n;
		System.out.printf("Altura média: %.2f%n", avg);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
		System.out.println(peopleName);
		
		sc.close();
 
	}
 
}