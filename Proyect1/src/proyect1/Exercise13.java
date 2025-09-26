package proyect1;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// We create varibles to know if its raining
		boolean Raining;
		// Varible to know if the homework is done
		boolean HomeworkDone;
		// Varible to know if the user has to go to the library
		boolean GoToLibrary;
		// Variable for going or not going out
		boolean GoOut;
		
		System.out.println("¿Está lloviendo?");
		Raining = sc.nextBoolean();
				
		System.out.println("¿Has hecho tus tareas?");
		HomeworkDone = sc.nextBoolean();
				
		System.out.println("¿Tienes que ir a la biblioteca?");
		GoToLibrary = sc.nextBoolean();
		
		GoOut = (!Raining && HomeworkDone) || GoToLibrary;
		System.out.println("¿Puedes salir a la calle?" +  GoOut );
		
						
		//Close the scanner
		sc.close();
	}

}
