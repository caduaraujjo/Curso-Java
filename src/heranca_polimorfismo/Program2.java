package heranca_polimorfismo;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program2 {

	public static void main(String[] args) {

		Account acc = new Account(001, "Alex", 1000.0);
		acc.withdraw(200.0);
		System.out.println(acc.getBalance());

		Account acc2 = new SavingsAccount(002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());

		Account acc3 = new BusinessAccount(003, "Cadu", 1000.0, 100.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}
}
