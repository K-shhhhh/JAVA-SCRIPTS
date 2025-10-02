package Arrays;

import java.util.Scanner;

public class NewMatrix {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter no. of rows : ");
            int rows = scan.nextInt();
            System.out.print("Enter no. of columns : ");
            int cols = scan.nextInt();
            
            int numbers [][] = new int[rows][cols];
            
            for(int i = 0; i < rows; i++){
                for(int j = 0;j<cols;j++){
                    numbers[i][j] = scan.nextInt();
                }
            }
            
            for(int i = 0; i < rows; i++){
                for(int j = 0;j<cols;j++){
                    System.out.print(numbers[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
