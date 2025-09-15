package If_Else_Switch;

import java.util.Scanner;

public class GreetingSwitch {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.print("enter langauge = ");
        String a = scan.nextLine();

        switch (a){
            case "hindi" : System.out.println("Namaste");
            break;
            case "english" : System.out.println("Hello");
            break;
            case "french" : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Input"); 
        }
        scan.close();
    }
}
