package Loops;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number = ");
        int n = scan.nextInt();

        int total = 0;

        for (int i = 2; i<=n/2; i++){
            if(n%i == 0){
                total = total + 1;
            } 
        }

        if (total == 1){
            System.out.println("Non-Prime number");
        } else{
            System.out.println("Prime NUmber");
        }

        scan.close();

    }
}
