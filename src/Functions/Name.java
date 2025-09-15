package Functions;

import java.util.Scanner;

public class Name {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Whats your name : ");
        String name = scan.nextLine();
        printMyName(name);
        scan.close();
    }
}
