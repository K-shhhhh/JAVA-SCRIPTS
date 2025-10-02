package Projects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Random random = new Random();
        try (Scanner scan = new Scanner(System.in)) {
            String moves[] = {"Rock", "Paper", "Scissors"};
            
            int gameover = 0;
            
            while(gameover == 0){
                
                String computermove = moves[random.nextInt(moves.length)];
                System.out.print("Rock, Paper, Scissors, Shoot : ");
                String usermove = scan.nextLine();
                
                if (!usermove.equalsIgnoreCase("rock") && !usermove.equalsIgnoreCase("paper")&& !usermove.equalsIgnoreCase("scissors")){
                    System.out.println("Invalid move. Exiting");
                    break;
                }
                
                System.out.println("Computer move : " + computermove);
                System.out.println("Your move : " + usermove);
                
                if (usermove.equalsIgnoreCase(computermove)){
                    System.out.println("Its a tie, play again!");
                } else if((usermove.equalsIgnoreCase("Rock") && computermove.equalsIgnoreCase("Scissors")) || (usermove.equalsIgnoreCase("Scissors") && computermove.equalsIgnoreCase("Paper")) || (usermove.equalsIgnoreCase("Paper") && computermove.equalsIgnoreCase("Rock"))){
                    System.out.println("You Win");
                } else{
                    System.out.println("Computer wins, better luck next time");
                }
                
                System.out.print("Do you want to play again (yes/no) : ");
                String answer = scan.nextLine();
                
                if (answer.equalsIgnoreCase("no")){
                    System.out.println("Exiting....");
                    gameover = 1;
                }
                
                System.out.println("\n----------------------------\n");
            }
        }
        

    }

}
