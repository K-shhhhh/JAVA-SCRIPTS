package Sorting;

import java.util.Scanner;

public class bubble_sort {

    public static void scanArray(int array[], int size, Scanner scan) {
        for (int i = 0; i < size; i++) {
            System.out.print("Enter array element " + (i + 1) + " : ");
            array[i] = scan.nextInt();
        }
        scan.close();
    }

    public static void printArray(int array[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void bubbleSort(int array[], int size){
        // using 2 loops to swap consecutive elements in ascending order
        for (int i = 0, n = size; i < n-1 ; i++ ){
            for (int j = 0; j<n-i-1;j++){
                // check condition
                if(array[j] > array[j+1]){
                    // actual swapping
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scan.nextInt();
        int[] array = new int[size];

        scanArray(array, size,scan);
        bubbleSort(array, size);
        System.out.println("\nArray elements are:");
        printArray(array, size);
        scan.close();
    }
}
