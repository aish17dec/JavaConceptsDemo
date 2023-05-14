public class FindPivotInRoatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,1,3};
        System.out.println(search(arr,1));
    }
    public static int search(int[] nums, int target) {
        int pivot =  find_pivot(nums);

        if(pivot == -1){ //If pivot not found
            return binary_search(nums, 0, nums.length-1, target);
        }

        //Find in 0 to pivot
        int res = binary_search(nums, 0, pivot, target);
        if (res == -1){
            res = binary_search(nums, pivot+1, nums.length-1, target);
        }
        return res;
    }

    static int binary_search(int[] nums, int s , int e, int target){

        while(s<=e){
            int m = s+e/2;

            if(target > nums[m])
                s = m+1;
            else if(target < nums[m])
                e = m-1;
            else
                return m;
        }

        return -1;
    }

    //find_pivot
    static int find_pivot(int[] nums){
        //Eg [4,5,6,7,0,1,2]
        int s = 0, e = nums.length -1;

        if(nums[s]<nums[e]) //If s smaller than e t means the array is not roated since if rotated the last element will always be smaller than first element
            return -1;

        if(nums.length == 1) //If length is 1 that element is the pivot itself
            return 0;

        while(s<=e){
            int m = (s+e)/2;

            if(nums[m]>nums[m+1]) //[7,0] when nums[m] == 7
                return m;
            else if(nums[m-1]>nums[m]) //[7,0] when nums[m] == 0
                return m-1; //previous element must be pivot
            else if(nums[s]>nums[m]) //m is in the second part of array we need not search there thus pushing end to m-1
                e = m-1;
            else if(nums[s]<nums[m]) // m is in first part of array thus moving s to m+1
                s = m+1;
        }

        return -1;
    }
}
