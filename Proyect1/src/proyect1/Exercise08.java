package proyect1;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// We create a new Scanner
		Scanner sc = new Scanner(System.in);

		// We create the variable for the name
		String name;
		// Variable for the age
		int age;

		// We ask for the Name of the user
		System.out.print("Introduce tu nombre: ");
		// And we read it
		name = sc.nextLine();

		// We ask for the address of the user
		System.out.print("\n¿Cuantos años tienes?: ");
		// And we read it
		age = sc.nextInt();

		// We print the message
		System.out.println("Hola " + name + ", tienes " + age + " años, ¡Qué mayor eres!");

		// And finally we close the scanner
		sc.close();
	}

}