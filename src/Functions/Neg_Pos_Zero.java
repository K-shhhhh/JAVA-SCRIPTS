package Functions;

import java.util.Scanner;

public class Neg_Pos_Zero {
    public static boolean continueEntering(Scanner scan){
        System.out.print("Do you want enter a number (y/n) : ");
        char ans = scan.next().charAt(0);
        return ans == 'y';
    }
    public static int readNumber(Scanner scan){
        System.out.print("Enter Number : ");
        return scan.nextInt();
    }
    public static void printCounts(int pos, int neg, int zeroes){
        System.out.println("\nPositive number entered : " + pos);
        System.out.println("Negative number entered : " + neg);
        System.out.println("Zeroes entered : " + zeroes);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        int zeroes = 0;

        while (continueEntering(scan)){
            int n = readNumber(scan);
            if (n > 0){
                pos++;
            } else if (n < 0){
                neg++;
            } else{
                zeroes++;
            }
        }
        printCounts(pos, neg, zeroes);
        scan.close();
    }
}
