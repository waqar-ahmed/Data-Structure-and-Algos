package algos;

import java.util.Arrays;

/**
 * Created by waqar on 2/6/2018.
 */
public class SelectionSort {

    public static void sort(int[] arr, int size){
        for(int i =0; i < size; i++){
            for(int j = i; j < size; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
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
