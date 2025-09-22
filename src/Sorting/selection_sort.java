package Sorting;

import java.util.Scanner;

public class selection_sort {
    public static void scanArray(int array[], int size, Scanner scan){
        for (int i = 0,n = size;i<n;i++){
            System.out.print("Enter element " + (i+1) + " : ");
            array[i] = scan.nextInt();
        }
    }
    public static void printArray(int array[],int size){
        for (int i = 0,n = size;i<n;i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void selectionSort(int array[],int size){
        for(int i = 0, n = size;i<n-1;i++){
            int smallest = i;
            // find the index of variable to swap
            for (int j = i+1,m=size;j<m;j++){
                if (array[smallest] > array[j]){
                    smallest = j;
                }
            }
            // actual swapping
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = scan.nextInt();
        int[] array = new int[size];
        scanArray(array,size,scan);
        selectionSort(array,size);
        printArray(array,size);
        scan.close();
    }
}
