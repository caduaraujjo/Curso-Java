package heranca_polimorfismo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.heranca_polimorfismo.ImportedProduct;
import entities.heranca_polimorfismo.Product;
import entities.heranca_polimorfismo.UsedProduct;

public class Program4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String manufactureDate = sc.nextLine();
				LocalDate mDate = LocalDate.parse(manufactureDate, fmt);
				list.add(new UsedProduct(name, price, mDate));
			}
			if (ch == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			if (ch == 'c') {
				list.add(new Product(name, price));
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product p : list) {
			System.out.println(p.priceTag());
		}

		sc.close();
	}

}
