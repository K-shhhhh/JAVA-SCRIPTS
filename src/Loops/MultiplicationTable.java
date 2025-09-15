package Loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n = scan.nextInt();
        int i = 1;
        while(i<11){
            System.out.println(n + " * " + i + " = " + (n*i));
            i++;
        }
        System.out.println("Thankyou!");
        scan.close();
    }
}
