package proyect1;

import java.util.Scanner;

public class Excercise10 {

	public static void main(String[] args) {

	        // Create a new Scanner
	        Scanner sc = new Scanner(System.in);

	        // Variable for the number
	        int number;
	        // Boolean variable to indicate if the user is of legal age
	        boolean par;

	        // Ask the user for a number
	        System.out.println("Escribe un número: ");
	        // Read the number
	        number = sc.nextInt();

	        // Check if the number is multiple of 2
	        par = number % 2 == 0;

	        // Print the result based on the value of 'par'
	            System.out.println("¿El número introducido es par?" +  par );
	  
	        // Finally, close the scanner
	        sc.close();

	}

}
