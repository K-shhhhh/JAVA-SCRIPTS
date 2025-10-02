package Functions;

import java.util.Scanner;

public class Factorial {
    public static void getFact(int n){
        if(n<0){
            System.out.println("Invalid Output!");
            return;
        }
        int total = 1;
        for(int i = n; i > 0;i--){
            total = total * i;
        }
        System.out.println("Factorial : " + total);
    }
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter number = ");
            int n = scan.nextInt();
            getFact(n);
        }
    }
}
