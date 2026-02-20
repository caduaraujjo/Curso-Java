package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Student> set = new HashSet<>();

		System.out.print("How many students for course A? ");
		int quantityA = sc.nextInt();
		for (int i = 1; i <= quantityA; i++) {
			int id = sc.nextInt();
			Student student = new Student(id);
			set.add(student);
		}

		System.out.print("How many students for course B? ");
		int quantityB = sc.nextInt();
		for (int i = 1; i <= quantityB; i++) {
			int id = sc.nextInt();
			Student student = new Student(id);
			set.add(student);
		}

		System.out.print("How many students for course C? ");
		int quantityC = sc.nextInt();
		for (int i = 1; i <= quantityC; i++) {
			int id = sc.nextInt();
			Student student = new Student(id);
			set.add(student);
		}

		System.out.println("Total students: " + set.size());
		sc.close();
	}
}
