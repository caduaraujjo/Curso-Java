package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	public void processContract(Contract contract, Integer months) {
		PaypalService paypal = new PaypalService();
		Double baseValue = contract.getTotalValue() / months;
		Double amount = 0.0;

		for (int i = 1; i <= months; i++) {
			amount = paypal.interest(baseValue, i);
			amount = paypal.paymentFee(amount);

			LocalDate dueDate = contract.getDate().plusMonths(i);

			contract.getInstallments().add(new Installment(dueDate, amount));
		}
	}
}
