package proyect1;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Variable for the IVA
		final int IVA = 21;
		// And for the price we want to apply the IVA
		double price;
		// And also for the price with the IVA applied
		double IVAprice;
		
		//We ask the user for the price to apply the IVA
		System.out.println("Introduzca el precio: ");
		price = sc.nextDouble();
		
		// Create the variable IVAprice
		IVAprice = price + price*IVA/100;
		// Print the result
		System.out.println("El precio con IVA es: " + IVAprice);
		
		//Close the scanner
		sc.close();
	}

}
