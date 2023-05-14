import java.util.*;

public class UnionAndIntersectionOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {5,6,7,7,8,8,9,10};
        int[] nums2 = {8,9,9,12,10,11,12};

        //System.out.println(findUnion(nums1, 5, nums2, 5));
        System.out.println(doUnion(nums1,nums1.length,nums2,nums2.length));
    }

    static int findUnion(int a[], int n, int b[], int m){

        //Your code here
        int count = a.length;

        for(int i = 0; i< b.length; i++){

            boolean is_present = false;

            for(int j = 0; j<a.length ; j++){
                if(b[i] == a[j]){
                    is_present = true;
                    break;
                }
            }

            if(!is_present)
                count++;
        }

        return count;
    }

    public static int doUnion(int a[], int n, int b[], int m)
    {
        int count=0;
        //Your code here

        Set<Integer> s = new HashSet();
        for(int p:a){
            s.add(p);
        }

        Set<Integer> s2 = new HashSet();
        for(int p:b){
            s2.add(p);
        }

        int p = s2.size();
        b = new int[p];

        int i = 0;
        for (int x : s2)
            b[i++] = x;

        count = s.size();

        Arrays.sort(a);

        for(i = 0; i<b.length; i++){

            boolean is_present = doBinarySearch(a, b[i]);

            if(!is_present)
                count++;

        }

        return count;
    }

    static boolean doBinarySearch(int[] a, int n){

        int s =0, e = a.length-1;

        while(s<=e){
            int m = s + (e-s)/2;

            if(n>a[m])
                s = m+1;
            else if(n<a[m])
                e = m-1;
            else
                return true;
        }

        return false;
    }
}
