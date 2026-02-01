package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		Integer number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy):");
		LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Valor do contrato: ");
		Double totalValue = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas: ");
		Integer months = sc.nextInt();

		Contract contract = new Contract(number, date, totalValue);

		ContractService service = new ContractService();
		service.processContract(contract, months);

		System.out.println();
		System.out.println("Parcelas: ");
		for (Installment i : contract.getInstallments()) {
			System.out.println(i);
		}
		sc.close();
	}
}
