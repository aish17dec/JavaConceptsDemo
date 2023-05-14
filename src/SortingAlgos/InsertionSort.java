package SortingAlgos;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        char[] arr = {'a','b','a','c'};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int i, int j , char[] arr){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static String insertionSort(char[] a){
        int n = a.length;
        for(int  i = 0; i<n-1; i++){
            for(int j = i+1; j>0; j--){
                if(a[j]<a[j-1])
                    swap(j, j-1, a);
                else
                    break;
            }
        }
        return (new String(a));
    }
}
