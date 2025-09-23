package proyect1;

import java.util.Scanner;

public class Exercise09 {

    public static void main(String[] args) {

        // Create a new Scanner
        Scanner sc = new Scanner(System.in);

        // Variable for the age
        int age;
        // Boolean variable to indicate if the user is of legal age
        boolean mayority;

        // Ask for the age
        System.out.println("¿Cuántos años tienes?");
        // Read the age
        age = sc.nextInt();

        // Check if the age is 18 or older
        if (age >= 18) {
            mayority = true; // If age is 18 or older, the user is of legal age
        } else {
            mayority = false; // If age is less than 18, the user is not of legal age
        }

        // Print the result based on the value of 'activo'
        if (mayority) {
            System.out.println("El usuario es mayor de edad.");
        } else {
            System.out.println("El usuario no es mayor de edad.");
        }

        // Finally, close the scanner
        sc.close();
    }
}
