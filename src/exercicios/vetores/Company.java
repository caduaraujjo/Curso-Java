package exercicios.vetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Company {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employee = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i);
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			employee.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase : ");
		Integer id = sc.nextInt();
		Double percent = null;
		
		boolean existe = employee.stream().anyMatch(x -> x.getId().equals(id));
		if (!existe) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			percent = sc.nextDouble();
		}
		
		System.out.println();
		System.out.println("List of employees");
		for (Employee e : employee) {
			if(e.getId().equals(id)) {
				double aumento = e.getSalary() * (percent / 100);
				e.setSalary(aumento + e.getSalary());
 			}
			System.out.println(e);
		}
		sc.close();
	}

}
