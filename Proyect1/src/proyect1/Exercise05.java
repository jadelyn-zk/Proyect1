package proyect1;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {

		// We create a new Scanner
		Scanner sc = new Scanner(System.in);

		// We create the variable for the radius of the circuference
		double radius;
		// Variable for the area
		double area;
		// Variable for the length
		double length;

		// We ask for the user for the radius
		System.out.println("Introduce el radio de la circunferencia (en cm): ");
		// And we read it
		radius = sc.nextDouble();

		// Now we calculate the length
		length = Math.PI * radius;

		// And then we calculate the area
		area = Math.PI * (radius * radius);

		// We print our results
		System.out.println("La longitud es: " + length + " cm" + "\nEl área es: " + area + " cm²");
		sc.close();

	}

}