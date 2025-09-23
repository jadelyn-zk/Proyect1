package proyect1;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {

		// We create a new Scanner
		Scanner sc = new Scanner(System.in);

		// Variable for the age
		int age;
		// We declare the boolean variable
		boolean activo = true;
		
		
		// We ask for the age
		System.out.println("¿Cuántos años tienes?");
		// And we read it
		age = sc.nextInt();
		
		if (activo) { 
		    System.out.println("El usuario es mayor de edad.");
		} else {
		    System.out.println("El usuario no es mayor de edad."); 
		}
				
				

		

		
		
		
		
		
		
		// And finally we close the scanner
		sc.close();

	}

}
