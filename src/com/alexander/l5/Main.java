package com.alexander.l5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        boolean isPlaying = true;

        // #1 Ask for the user's name

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();
        System.out.println("Player #1: " + playerName);

        // #2 Ask the user to enter a number X
        System.out.print("Enter a number X: ");
        x = scanner.nextInt();

        //  Run a for-loop X number of times
        for (int i = 0; i < x; i++) {
            System.out.println("Throwing");
        }

        // #3 Run a do-while loop (never-ending) to keep taking input
        // #4: Exit the do-while loop if the user enters "stop"
        do {
            System.out.print("Enter your choice (1 to Throw, 'stop' to exit): ");
            String input = scanner.next();

            // #5: Use a switch statement to handle user input
            switch (input) {
                case "1":
                    System.out.println("Throwing!");
                    break;
                case "stop":
                    isPlaying = false;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }

        } while (isPlaying);

        // Close the scanner when done
        scanner.close();
    }
}
