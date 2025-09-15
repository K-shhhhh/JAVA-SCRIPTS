package Arrays;
import java.util.Scanner;

public class SearchX {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int X = 10;
        System.out.print("Enter size of array : ");
        int n = scan.nextInt();
        int array[] = new int[n];
        int count = 0;
        for (int i = 0; i < n;i++){
            System.out.print("Enter element " + (i+1) + " : ");
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++){
            if (array[i] == X){
                System.out.println("Found!, Number at " + i +"th index");
                count = count + 1;
                break;
            } else{
                System.out.println("Searching....");
            }
        }
        if(count == 0){
            System.out.println("Sorry, number not found.");
        }
        scan.close();
    }
}

