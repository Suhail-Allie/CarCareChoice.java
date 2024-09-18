package org.example;
import java.util.Scanner;

    public class CarCareChoice {

        public static void main(String[] args) {
            // Create a scanner object for input
            Scanner input = new Scanner(System.in);

            // Display the list of available services
            System.out.println("Chapa's Car Care Shop Services:");
            System.out.println("1. Oil change");
            System.out.println("2. Tire rotation");
            System.out.println("3. Battery check");
            System.out.println("4. Brake inspection");
            System.out.println("Please enter the service you want:");

            // Get the user's choice
            String serviceChoice = input.nextLine().toLowerCase();

            // Display the corresponding price based on the service
            switch (serviceChoice) {
                case "oil change":
                    System.out.println("Service: Oil change - Price: $25");
                    break;
                case "tire rotation":
                    System.out.println("Service: Tire rotation - Price: $22");
                    break;
                case "battery check":
                    System.out.println("Service: Battery check - Price: $15");
                    break;
                case "brake inspection":
                    System.out.println("Service: Brake inspection - Price: $5");
                    break;
                default:
                    System.out.println("Error: Invalid service selected.");
            }

            // Close the scanner
            input.close();
        }
    }


