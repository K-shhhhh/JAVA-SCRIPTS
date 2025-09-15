package Loops;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        int i = 0;
        int sum = 0;
        do{
            sum = sum + i;
            i++;
        } while (i <= n);
        System.out.println("Sum of N number : " + sum);
        scan.close();
    }
}
