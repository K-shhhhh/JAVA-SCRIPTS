package Projects;

import java.util.Random;
import java.util.Scanner;

public class Mastermind {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        
        int secret = random.nextInt(9999) + 1000; 

        int attempts = 0;
        boolean guessed = false;

        
        while (!guessed) {
            System.out.print("Enter your 4-digit guess: ");
            int guess = scan.nextInt(); 

            
            if (guess < 1000 || guess > 9999) {
                System.out.println("Invalid guess. Please enter a 4-digit number.");
                continue; 
            }

            
            String secretStr = Integer.toString(secret);
            String guessStr = Integer.toString(guess);

            
            int bulls = 0, cows = 0;

            // Count bulls
            for (int i = 0; i < 4; i++) {
                if (secretStr.charAt(i) == guessStr.charAt(i)) {
                    bulls++; // Increment bulls if digits match at the same position
                }
            }

            // Count cows
            for (int i = 0; i < 4; i++) {
                if (secretStr.charAt(i) != guessStr.charAt(i) &&
                    guessStr.contains(String.valueOf(secretStr.charAt(i)))) {
                    cows++; // Increment cows if digit exists in secret but at a different position
                }
            }

            
            System.out.println("Bulls: " + bulls + " Cows: " + cows);

            
            if (bulls == 4) {
                guessed = true; 
            }

            attempts++; 
        }

        
        System.out.println("Congratulations! You've guessed the number.");
        System.out.println("It took you " + attempts + " attempts.");

        scan.close(); 
    }
}


