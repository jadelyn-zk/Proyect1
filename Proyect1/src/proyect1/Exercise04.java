package proyect1;

import java.util.Scanner;

public class Exercise04 {

	
	
	public static void main(String[] args) {
	
	
	//Variable of the number that were typing in
		int number;
	// Asking for the number
		System.out.println("Introduce un número:");
	//We create the Scanner
		Scanner reader = new Scanner (System.in) ;
	//Then we read the number
		number = reader.nextInt();
	//Now we know the number and we can print it
		System.out.println("Tu número es "+ (number));
	//Finally, we close the Scanner we've created
		reader.close();
	}

}
