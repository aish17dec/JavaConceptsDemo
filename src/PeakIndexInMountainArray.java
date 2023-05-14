public class PeakIndexInMountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int s = 0, e = arr.length-1; int m = 0;

        while(s<=e){
             m = (s+e)/2;
            if(arr[m]> arr[m+1] && arr[m-1]>arr[m]){
                //in descending part
                e = m;
            }else if(arr[m]< arr[m+1] && arr[m-1]<arr[m]){
                //in ascending part
                s = m+1;
            }else if(arr[m+1]< arr[m] && arr[m-1]<arr[m]){
                return m;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
