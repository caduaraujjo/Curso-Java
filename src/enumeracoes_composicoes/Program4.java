package enumeracoes_composicoes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate birthDate = LocalDate.parse(sc.nextLine(),fmt);
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.println("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		System.out.println("How many items to this order? ");
		Integer itemsNumber = sc.nextInt();
		Order order = new Order(LocalDateTime.now(), status, client);
		for (int i = 1; i <= itemsNumber; i++) {
			sc.nextLine();
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			String pName = sc.nextLine();
			System.out.println("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			Product product = new Product(pName, price);
			OrderItem item = new OrderItem(quantity, price, product);
			order.addItem(item);
		}
		sc.close();
		System.out.println(order);
	}

}
