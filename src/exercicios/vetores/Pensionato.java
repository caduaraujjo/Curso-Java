package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Guest;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Guest[] guest = new Guest[10];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d\n", i+1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			Integer room = sc.nextInt();
			
			guest[room] = new Guest(name, email, room);
			
		}
		
		System.out.println("Busy rooms: ");
		for(int i=0; i<guest.length; i++) {
			if(guest[i] != null) {
				System.out.println(guest[i].getRoom() + ": " + guest[i].getName() + ", " + guest[i].getEmail());
			}
		}
		sc.close();

	}

}
