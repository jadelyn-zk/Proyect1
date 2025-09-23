package proyect1;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {

		// We create a new Scanner
		Scanner sc = new Scanner(System.in);

		// We create the variables
		double number1;
		double number2;

		// We ask for a number
		System.out.println("Introduce el primer número: ");
		// We read It
		number1 = sc.nextDouble();

		// We ask for another number
		System.out.println("Introduce otro número: ");
		// And we read this number too
		number2 = sc.nextDouble();

		// We print the results
		System.out.println("Ambos suman: " + (number1 + number2) + "\nRestados dan: " + (number1 - number2));
		System.out.println("La multiplicación resulta en: " + (number1 * number2) + "\nLa división entre ambos da: "
				+ (number1 / number2));

		// We close the scanner
		sc.close();

	}

}