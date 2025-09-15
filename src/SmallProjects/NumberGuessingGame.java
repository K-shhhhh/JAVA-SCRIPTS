package SmallProjects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        
        int correctnumber = random.nextInt(100) + 1;
        int correctguess = 0;

        System.out.print("I have thought of a number from 1 to 100, guess it!" );

        while(correctguess == 0){
            
            System.out.print("Enter guess : ");

            if (!scan.hasNextInt()){
                String wrong = scan.next();
                System.out.print("\"" + wrong + "\" is not a valid number. Please enter an integer between 1 and 100");
                continue;
            }

            int guess = scan.nextInt();

            if (guess < 1 || guess >100){
                System.out.print("Number out of range!");
                continue;
            }

            if (guess < correctnumber){
                System.out.println("Too Low");
            } else if(guess > correctnumber){
                System.out.println("Too High");
            } else{
                System.out.println("Correct! You guess the number.");
                System.out.println("Thank you!");
                correctguess = 1;
            }
        }
        
        scan.close();

    }
}
