package Functions;

import java.util.Scanner;

public class Name {
    public static void printMyName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Whats your name : ");
            String name = scan.nextLine();
            printMyName(name);
        }
    }
}
