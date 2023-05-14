package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high){
        if(high>low){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    static int partition(int[] arr, int low, int high) {

        int pi = high;
        int pivot = arr[pi];
        int i = low-1;
        for(int j = low; j<=high;j++){
            if(arr[j]<=pivot){
                i++;
                swap(i,j,arr);
                if(arr[i] == pivot)
                    pi = i;
            }
        }

        return pi;
    }

    static void swap(int i, int j , int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
