package Arrays;

public class MinMax {
    public static void main(String[] args) {
        int array[] = {2,3,4,5,0,6,7,8,13,9};

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < 10; i++){
            if (array[i] < min){
            min = array[i];
            } else if(array[i] > max){
            max = array[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max : " + max);
    }
}
