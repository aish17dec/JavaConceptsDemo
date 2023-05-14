
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {13,11,8,6,4,2};
        System.out.println(binary_search(arr, 6));
    }

    static int binary_search(int[] arr, int x){
        boolean is_Asc = arr[0] < arr[arr.length-1];
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(is_Asc){
                if(arr[mid]< x)
                    start = mid+1;
                else if(arr[mid]>x)
                    end = mid-1;
                else
                    return mid;
            }else{
                if(arr[mid]> x)
                    start = mid+1;
                else if(arr[mid]<x)
                    end = mid-1;
                else
                    return mid;
            }
        }

        return -1;
    }
}
