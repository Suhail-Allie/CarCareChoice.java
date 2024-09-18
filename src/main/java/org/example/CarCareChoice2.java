package org.example;
import java.util.Scanner;

    public class CarCareChoice2 {

        public static void main(String[] args) {
            // Create a scanner object for input
            Scanner input = new Scanner(System.in);

            // Display the list of available services
            System.out.println("Chapa's Car Care Shop Services:");
            System.out.println("1. Oil change");
            System.out.println("2. Tire rotation");
            System.out.println("3. Battery check");
            System.out.println("4. Brake inspection");
            System.out.println("Please enter the first three letters of the service you want:");

            // Get the user's choice and convert it to lowercase
            String serviceChoice = input.nextLine().toLowerCase();

            // Check the first three characters to match the service
            if (serviceChoice.startsWith("oil")) {
                System.out.println("Service: Oil change - Price: $25");
            } else if (serviceChoice.startsWith("tir")) {
                System.out.println("Service: Tire rotation - Price: $22");
            } else if (serviceChoice.startsWith("bat")) {
                System.out.println("Service: Battery check - Price: $15");
            } else if (serviceChoice.startsWith("bra")) {
                System.out.println("Service: Brake inspection - Price: $5");
            } else {
                System.out.println("Error: Invalid service selected.");
            }

            // Close the scanner
            input.close();
        }
    }


