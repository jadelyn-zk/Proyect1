package proyect1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		//We create a new Scanner
		Scanner sc = new Scanner(System.in);
			
		//We create the variables, the 2 different grades.
		int grade1; 
		int grade2;
				
		//We ask for the first grade
		System.out.println("Introduce una nota: ");
		//And we read It
		grade2 = sc.nextInt(); 
		//Then we ask for the second grade
		System.out.println("Introduce otra nota: ");
		//And we read it too
		grade1 = sc.nextInt(); 
		
		//We print the average of the grades
		System.out.println("Tu nota media es: " + ((grade2+grade1)/2));
		
		//Finally, we close the scanner
		sc.close();

	}
}