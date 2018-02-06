package com.bmw.tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by waqar on 1/20/2018.
 */
public class Task1 {

    public static double calculateMedian(int[] arr, int i){
        double median = 0;
        Arrays.sort(arr);
        if(arr.length == 1) return (double)arr[0];

        if(arr.length % 2 == 0){
            int index = arr.length / 2;
            median = arr[index-1] + arr[index];
            median = (double)median/2;
        }
        else{
            int index = arr.length / 2;
            median = (double)arr[index];
        }
        return median;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            System.out.println(calculateMedian(a, a_i));
        }
    }
}
