package Recursion;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1,2,1,2,1,2,1,2};
        //System.out.println(is_sorted_2(arr,1));
        System.out.println(findAllIndex(arr,0,2));;
    }

    static boolean is_sorted(int[] arr, int i){
        if(i == arr.length)
            return true;
        if(arr[i]<arr[i-1])
            return false;

        return is_sorted(arr, i+1);
    }

    static boolean is_sorted_2(int[] arr, int i){
        if(i == arr.length)
            return true;

        return arr[i]>arr[i-1] && is_sorted(arr, i+1);
    }

    static List findAllIndex(int[] arr, int i, int target){

        List res = new ArrayList<>();
        if(i == arr.length)
            return new ArrayList<>();
        if(arr[i]==target){
            res.add(i);
        }

        res.addAll(0,findAllIndex( arr,  i+1,  target));
        return res;

    }
}
