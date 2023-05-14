package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={2,3,1,3,2,4,1,2};
        arr = merge_sort(arr);
        System.out.println(Arrays.toString(arr));
        arr = merge_sort_inplace(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static int[] merge_sort(int[] arr) {
        if(arr.length == 1)
            return arr;

        int m = (0+ arr.length)/2;

        int[] left_arr = merge_sort(Arrays.copyOfRange(arr,0,m));
        int[] right_arr = merge_sort(Arrays.copyOfRange(arr,m,arr.length));

        return merge_arrays(left_arr, right_arr);
    }

    static int[] merge_sort_inplace(int[] arr, int s, int e) {
        if(s==e){
            return new int[]{arr[s]};
        }

        int m = (s+e)/2;

        int[] left_arr = merge_sort_inplace(arr, s,m);
        int[] right_arr = merge_sort_inplace(arr, m+1,e);

        return merge_arrays(left_arr, right_arr);
    }

    static int[] merge_arrays(int[] left_arr, int[] right_arr) {
        int[] res = new int[left_arr.length + right_arr.length];
        int l,r,k;
        l = r=k=0;

        while(l<left_arr.length && r<right_arr.length){

            if(left_arr[l] < right_arr[r]){
                res[k] = left_arr[l];
                k++;
                l++;
            }else{
                res[k] = right_arr[r];
                k++;
                r++;
            }

        }

        while(l<left_arr.length){
            res[k] = left_arr[l];
            k++;
            l++;
        }

        while(r<right_arr.length){
            res[k] = right_arr[r];
            k++;
            r++;
        }

        return res;
    }
}
