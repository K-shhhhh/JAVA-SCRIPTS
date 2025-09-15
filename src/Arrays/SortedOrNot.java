package Arrays;

public class SortedOrNot {
    public static void main(String[] args) {
        
        int array[] = {0,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for(int i = 0;i<9;i++){
            if (array[i] > array[i+1]){
                System.out.println("Not Sorted Array");
                count = count + 1;
                break;
            }
        }
        if(count == 0){
            System.out.println("Sorted Array");
        }
    }
}
