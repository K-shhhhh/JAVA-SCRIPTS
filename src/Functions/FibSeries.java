package Functions;

import java.util.Scanner;

public class FibSeries {
    public static void series(int n){
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);

        while (true){
            c = a + b;
            if (c > n){
                break;
            }
            System.out.println(c);
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        series(n);
        scan.close();
    }
}
