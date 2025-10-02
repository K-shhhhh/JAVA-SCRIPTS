package Functions;

import java.util.Scanner;

public class SumOfOddN {
    public static int getSum(int n){
        int total = 0;
        for (int i = 1; i <= n; i++){
            if (i % 2 != 0){
                total = total + i;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter n : ");
            int n = scan.nextInt();
            System.out.println("Sum of all odd numbers till n = " + getSum(n));
        }
    }
}
