package proyect1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {

        // Create a new Scanner
        Scanner sc = new Scanner(System.in);

        // Variable for the euro
        int euro;
    
        // Ask the user for a number
        System.out.println("¿Cuantos euros quieres pasar a pesetas?: ");
        // Read the number
        euro = sc.nextInt();
        
        //Print the results in pesetas
        System.out.println("El cambio a pesetas es: " + euro*166 );
        
		//Close the scanner
        sc.close();
        }

}
