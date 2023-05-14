package SortingAlgos;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,7,3,4,5,2,6};
        cyclicSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] a){
        for(int i = 0; i<a.length; i++){
            while ((a[i]-1)!=i) {
                swap(a[i]-1, i, a);
            }
        }
    }

    static void swap(int i, int j, int[] a){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
