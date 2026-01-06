package heranca_polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.heranca_polimorfismo.Company;
import entities.heranca_polimorfismo.Individual;
import entities.heranca_polimorfismo.TaxPayer;

public class Program6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpend = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpend));
			} else {
				System.out.print("Number of employees: ");
				Integer numberEmp = sc.nextInt();
				list.add(new Company(name, anualIncome, numberEmp));
			}
		}

		sc.close();

		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer t : list) {
			System.out.println(t.getName() + ": $ " + String.format("%.2f", t.tax()));
		}

		Double sum = 0.0;
		for (TaxPayer t : list) {
			sum += t.tax();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: " + " $ " + String.format("%.2f", sum));
	}

}
