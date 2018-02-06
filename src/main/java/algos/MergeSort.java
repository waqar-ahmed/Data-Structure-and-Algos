package algos;

import java.util.Arrays;

/**
 * Created by waqar on 2/4/2018.
 */
public class MergeSort {

    public static int[] merge(int[] a, int p, int q, int r){
        int n1 = q-p+1;
        int n2 = r-q;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; i++){
            L[i] = a[p+i];
        }

        for(int i = 0; i < n2; i++){
            R[i] = a[q+i+1];
        }


        int i = 0, j = 0;

        int k = p;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                a[k] = L[i];
                i++;
            }
            else
            {
                a[k] = R[j];
                j++;
            }
            k++;
        }

         /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            a[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            a[k] = R[j];
            j++;
            k++;
        }
        return a;
    }

    public static void mergeSort(int[] a, int p, int r){
        if(p < r){
            int q = (p+r)/2;
            mergeSort(a, p, q);
            mergeSort(a, q+1, r);
            merge(a, p, q, r);
        }
    }


    public static void main( String[] args ) {

        int[] arr = {4,5,6,3,1,7,8,2};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

}
