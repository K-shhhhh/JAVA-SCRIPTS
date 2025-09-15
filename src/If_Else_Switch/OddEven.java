package If_Else_Switch;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Number : ");
        int num = scan.nextInt();

        if (num %2 == 0){
            System.out.println(num + " is an Even Number");
        } else{
            System.out.println(num + " is an Odd Number");
        }
        scan.close();
    }
}
