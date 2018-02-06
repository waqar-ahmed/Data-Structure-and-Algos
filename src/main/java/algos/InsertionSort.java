package algos;

import java.util.Arrays;

/**
 * Created by waqar on 2/4/2018.
 */


public class InsertionSort {

    public static int[] insertionSort(int[] arr){

        for(int j = 1; j < arr.length; j++){
            int key = arr[j];
            int i = j;
            while(i > 0 && arr[i-1] > key){
                arr[i] = arr[i-1];
                i--;
            }
            arr[i] = key;
        }
        return arr;
    }

    public static void main( String[] args ) {

        int[] arr = {4,5,6,3,1,7,8,2};
        System.out.println(Arrays.toString(insertionSort(arr)));

    }
}
