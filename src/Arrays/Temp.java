package Arrays;

import java.util.Scanner;

public class Temp{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter number of temperatures you want to use : ");
        int n = scan.nextInt();
        int sum = 0;
        int temp[] = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Enter temp " + (i+1) + " : ");
            temp[i] = scan.nextInt();
            sum = sum + temp[i];
        }
        int average = sum/n;
        /*
         * WE WILL USE FOR-EACH LOOP FOR THE FIRST TIME
         * IN THIS LOOP, WE GO THROUGH EACH ELEMENT OF THE ARRAY
         * FORMAT : FOR (DATATYPE TEMPARORY VARIABLE : ARRAYNAME)
         */
        for (int temperature : temp){
            if (temperature < average) {
                System.out.print("\nTemperature : " + temperature + " is less than average : " + average);
            } else if (temperature > average){
                System.out.print("\nTemperature : " + temperature + " is more than average : " + average);
            } else {
                System.out.print("\nTemperature : " + temperature + " is equal to average : " + average);
            }
        }

        scan.close();
    }
}