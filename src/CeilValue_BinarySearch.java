public class CeilValue_BinarySearch {
//Given a sorted array and a target element, find an element from an array which is equal to or just greater than the target element

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};

        System.out.println(ceilValue(arr, 19));

    }

    static int ceilValue(int[] a, int t){
        int s = 0, e = (a.length)-1;


        while(s<=e){
            int m = (s+e)/2;

            if(a[m]>t)
                e = m-1;
            else if(a[m] < t){
                s = m+1;
            }
            else if(a[m] == t)
                return a[m];

            //In below approach after making several comparison the code will realise that the ceil is greater than largest element of array
            //or target is smaller than smallest element of array, thus bad approach

           /* if(s == a.length || e<0)
                return -1;*/

            //Better Approach
            if(t>a[a.length-1] || e< a[0])
                return -1;
        }

        return s;
    }
}


