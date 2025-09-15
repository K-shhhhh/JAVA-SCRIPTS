package Functions;

import java.util.Scanner;

public class SumOf2 {
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = scan.nextInt();
        System.out.print("Enter number : ");
        int b = scan.nextInt();
        System.out.println("Sum = " + calculateSum(a, b));
        scan.close();
    }
}
