package algos;

import java.util.Arrays;

/**
 * Created by waqar on 2/4/2018.
 */
public class QuickSort {

    public static void quickSort(int[] A, int p, int r){
        if(p < r){
            int q = partition(A, p, r);
            quickSort(A, p, q-1);
            quickSort(A, q+1, r);
        }
    }

    public static int partition(int[] A, int p, int r){
        int x = A[r];
        int i = p-1;
        for(int j = p; j < r; j++){
            if(A[j] <= x){
                i++;
                //swap(A, i, j);
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i+1];
        A[i+1] = A[r];
        A[r] = temp;
        return i+1;
    }

    public static void main( String[] args ) {

        int[] arr = {4,5,6,3,1,7,8,2};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
