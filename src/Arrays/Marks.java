package Arrays;

import java.util.Scanner;

public class Marks {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter number of subjects : ");
        int n = scan.nextInt();

        int marks[] = new int[n];
        
        for (int i = 0; i < n;i++){
            System.out.print("Enter marks of subject " + (i+1) + " : ");
            marks[i] = scan.nextInt();
        }

        for (int i = 0; i < n;i++){
            System.out.println(marks[i]);
        }
        scan.close();

    }
}
