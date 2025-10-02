package String_Methods;

import java.util.Scanner;

public class Total_Length {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("What should be the size of the array : ");
            int size = scan.nextInt();
            scan.nextLine();
            
            String array[] = new String[size];
            int totalLength = 0;
            
            for (int i = 0; i < size; i++) {
                System.out.print("Enter String no. " + (i + 1) + " : ");
                array[i] = scan.nextLine();
                totalLength += array[i].length();
            }
            
            System.out.println("\nYou entered:");
            for (int i = 0; i < size; i++) {
                System.out.println(array[i]);
            }
            
            System.out.println("Total length of all strings: " + totalLength);
        }
    }
}
