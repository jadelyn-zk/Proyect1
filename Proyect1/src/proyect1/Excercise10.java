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
	        if (number % 2 == 0) {
	            par = true; 
	        } else {
	            par = false;
	        }

	        // Print the result based on the value of 'par'
	        if (par) {
	            System.out.println("El número introducido es par.");
	        } else {
	            System.out.println("El número introducido es impar.");
	        }

	        // Finally, close the scanner
	        sc.close();

	}

}
