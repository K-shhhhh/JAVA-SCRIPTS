package Projects;

import java.util.Scanner;

public class SimpleCalculator {
    
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter First number : ");
            int a = scan.nextInt();
            System.out.print("Enter Second number : ");
            int b = scan.nextInt();
            System.out.println("1 for Addition, 2 for Subratction, 3 for Multiplication, 4 for Division");
            System.out.print("Enter Your Choice : ");
            int opr = scan.nextInt();
            switch(opr){
                case 1 -> System.out.println(a+b);
                case 2 -> System.out.println(a-b);
                case 3 -> System.out.println(a*b);
                case 4 -> System.out.println(a/b);
                default -> System.out.println("Invalid Output");
            }
        }
    }
}
