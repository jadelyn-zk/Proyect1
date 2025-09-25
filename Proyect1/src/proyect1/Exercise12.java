package proyect1;

import java.util.Scanner;
//2,35€ y el kilo de peras en 1,95€.

public class Exercise12 {

	public static void main(String[] args) {

		// Create a new Scanner
		Scanner sc = new Scanner(System.in);

		// Create variable for the kg of apples
		double apples;
		// Create variable for the kg of pears
		double pears;

		// Ask the user the kgs of apples
		System.out.println("¿Cuantos kilos de manzanas se han vendido?: ");
		//And read it
        apples = sc.nextInt();

		// Ask the user the kgs of pears
        System.out.println("¿Cuantos kilos de peras se han vendido?: ");
		//And read it
        pears = sc.nextInt();

        //Print the operation
        System.out.println("Resultan en " + apples*2.35 + "€ de vender manzanas" );
        System.out.println("Y " + pears*1.95 + "€ de vender peras" );
		sc.close();
	}

}
