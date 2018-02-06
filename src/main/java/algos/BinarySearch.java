package algos;

import java.util.Arrays;

/**
 * Created by waqar on 2/5/2018.
 */
public class BinarySearch {

    public static int search(int[] arr, int value, int min, int max){
        if(min < max){
            int middle = (min+max)/2;
            if(arr[middle] == value)
                return middle;
            else if(arr[middle] < value){
                return search(arr, value, middle+1, max);
            }
            else if(arr[middle] > value){
                return search(arr, value, min, middle-1);
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr, 1, 0, 9));
    }
}
