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
		
		System.out.println("Introduzca el precio: ");
		price = sc.nextDouble();
		
		IVAprice = price + price*IVA/100;
		System.out.println("El precio con IVA es: " + IVAprice);
		
		sc.close();
	}

}
