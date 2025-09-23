package proyect1;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// We create a new Scanner
		Scanner sc = new Scanner(System.in);

		// We create the variable for the name
		String name;
		// Variable for the address
		String address;
		// Variable for the telephone number
		int number;

		// We ask for the Name of the user
		System.out.print("Introduce tu nombre: ");
		// And we read it
		name = sc.nextLine();

		// We ask for the address of the user
		System.out.print("\nIntroduce tu dirección: ");
		// And we read it
		address = sc.nextLine();

		// We ask for the telephone number of the user
		System.out.print("\nIntroduce tu numero de teléfono: ");
		// And we read it
		number = sc.nextInt();

		// Finally we print the info
		System.out.println("Nombre: " + name);
		System.out.println("Dirección: " + address);
		System.out.println("Teléfono: " + number);

		// We close the scanner
		sc.close();
	}

}