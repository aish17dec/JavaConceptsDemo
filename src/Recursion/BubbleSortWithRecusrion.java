package Recursion;

import java.util.Arrays;

public class BubbleSortWithRecusrion {
    public static void main(String[] args) {
        int arr2[] = {3,2,1};
        arr2 = bubble_sort(arr2,0,0);
        int arr[] = {21, 32, 11, 25, 42, 15, 37};
        int n = arr.length;


        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));
    }

    static int[] bubble_sort(int[] arr, int i, int j){
        if(i == arr.length){
            return arr;
        }
        if(j == (arr.length-i-1)){
            return arr;
        }

        if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }

        arr = bubble_sort(arr, i, j+1);
        return arr;
    }
}
