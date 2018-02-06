package algos;

import java.util.Arrays;

/**
 * Created by waqar on 2/6/2018.
 */
public class BubbleSort {

    public static void sort(int[] arr, int size){
        for(int i =1; i < size-1; i++){
            for(int j = 0; j < size-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        int[] arr = {4,5,6,3,1,7,8,2};
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

}
