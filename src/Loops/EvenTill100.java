package Loops;

import java.util.Scanner;

public class EvenTill100 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 101; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        scan.close();
    }
}
