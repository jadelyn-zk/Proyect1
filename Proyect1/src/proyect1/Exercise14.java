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
		double gradeRecord;
		int reportCard;
		
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
		gradeRecord = (double) (grade1+grade2+grade3)/3;
		reportCard = (int) gradeRecord ;
		
		// And we print both results
		System.out.println("La nota media de tu boletín de calificaciones es: " + reportCard);
		System.out.println("La nota media de tu expediente académico es: " + gradeRecord);

		//Close the scanner
		sc.close();
	}

}
