package If_Else_Switch;

import java.util.Scanner;

public class GreaterIn3 {
        public static void main(String[] args){
            
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = scan.nextInt();
        System.out.print("Enter a number : ");
        int b = scan.nextInt();
        System.out.print("Enter a number : ");
        int c = scan.nextInt();

        if (a>b && a>c){
            System.out.println(a + " is the largest number ");
        } else if (b>a && b>c){
            System.out.println(b + " is the largest number");
        }else{
            System.out.println(c + " is the largest number");
        }
        scan.close();
        }
}
