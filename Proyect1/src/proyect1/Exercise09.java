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
        mayority = age>= 18;

        // Print the result based on the value of 'mayority'
            System.out.println("¿El usuario es mayor de edad?" +  mayority);
            
        // Finally, close the scanner
        sc.close();
    }
}
