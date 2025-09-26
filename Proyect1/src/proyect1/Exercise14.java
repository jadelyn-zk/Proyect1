package proyect1;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// We create the variables, the different grades.
		int grade1;
		int grade2;
		int grade3;
		// And for the two different results.
		double graderecord;
		int reportcard;
		
		// We ask for the first grade
		System.out.println("Introduce la nota del primer trimestre: ");
		// And we read It
		grade1 = sc.nextInt();

		// We ask for the second grade
		System.out.println("Introduce la nota del segundo trimestre: ");
		// Read It
		grade2 = sc.nextInt();

		// Then we ask for the third grade
		System.out.println("Introduce la nota del tercer trimestre: ");
		// And read it
		grade3 = sc.nextInt();

		// We make the operations for both of the results, creating the variables for the two different final grades.
		reportcard = (grade1+grade2+grade3)/3;
		graderecord = (double) (grade1+grade2+grade3)/3;
		
		// And we print both results
		System.out.println("La nota media de tu boletín de calificaciones es: " + reportcard);
		System.out.println("La nota media de tu boletín de calificaciones es: " + graderecord);

		sc.close();
	}

}
