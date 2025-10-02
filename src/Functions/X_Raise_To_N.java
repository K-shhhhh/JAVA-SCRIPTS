package Functions;

import java.util.Scanner;

public class X_Raise_To_N {
    public static Double getAns(Double x, Double n){
        Double total = Math.pow(x, n);
        return total;
    }
     public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter base number : ");
            Double x = scan.nextDouble();
            System.out.print("Enter power number : ");
            Double n = scan.nextDouble();
            System.out.println("X raise to N = " + getAns(x, n));
        }
     }
}
