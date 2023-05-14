package SortingAlgos;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3,4,2,1};
        bubbleSort(arr);
        //selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean is_swapped;
        for(int i = 0; i<arr.length-1; i++){
            is_swapped = false;
            for(int j = 0; j< n-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    swap(j+1,j,arr);
                    is_swapped = true;
                }
            }

            if(!is_swapped)
                break;
        }
    }

    static void swap(int i, int j , int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            //assuming first element is the biggest element
            int big = arr[0], k = 0;

            for(int j = 0; j<=n-i-1; j++){
                if(arr[j]>big){
                    big = arr[j];
                    k = j;
                }
            }

            //After finding biggest element replacing it with the required index
            swap(k, n-i-1, arr);
        }
    }
}
