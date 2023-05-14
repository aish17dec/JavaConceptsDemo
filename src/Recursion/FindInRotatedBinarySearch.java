package Recursion;

public class FindInRotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {9,10,1,2,3,4,5,6,7,8};
        System.out.println(find_element(arr, 0, arr.length-1, 10));
    }

    static int find_element(int[] a, int s, int e, int t){
        if(s>e)
            return -1;
        int m = (s+e)/2;

        if(a[m] == t)
            return m;

        if(t>a[m] && t<a[e])
            return find_element(a, m+1, e,t);

            return find_element(a, s, m-1,t);

    }
}
