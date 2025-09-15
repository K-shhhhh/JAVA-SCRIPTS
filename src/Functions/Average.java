package Functions;

import java.util.Scanner;

public class Average {
    public static double getAvg(double a, double b, double c){
        double avg = (a + b + c)/3;
        return avg;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        double a = scan.nextDouble();
        System.out.print("Enter number : ");
        double b = scan.nextDouble();
        System.out.print("Enter number : ");
        double c = scan.nextDouble();
        System.out.println("Average = " + getAvg(a, b, c));
        scan.close();
    }
}
