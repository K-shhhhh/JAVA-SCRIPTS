package Sorting;

import java.util.Scanner;

public class insertion_sort {
    public static void scanArray(int array[], int size, Scanner scan){
        for (int i = 0, n = size;i<n;i++){
            System.out.print("Enter element " + (i+1) + " : ");
            array[i] = scan.nextInt();
        }
    }
    public static void printArray(int array[],int size){
        for (int i = 0, n = size;i<n;i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void insertSort(int array[],int size){
        // i = 1 as we consider array[0] as sorted
        for(int i = 1, n = size;i<n;i++){
            // put value in current 
            int current = array[i];
            // index of previous value
            int j = i - 1;
            // j>=0 so that array doesnt end and current < array[j] to compare values
            while(j>=0 && current < array[j]){
                // insert value in ascending order
                array[j+1] = array[j];
                // decrement index value 
                j--;
            }
            // move to next element
            array[j+1] = current;
        }
    }
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter size of array : ");
            int size = scan.nextInt();
            int array[] = new int[size];
            scanArray(array, size, scan);
            insertSort(array, size);
            printArray(array, size);
        }
    }

}
