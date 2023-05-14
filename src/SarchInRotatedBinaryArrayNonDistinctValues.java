public class SarchInRotatedBinaryArrayNonDistinctValues {

    public static void main(String[] args) {
        int[] arr = {3,4,4,4,4,4,4,5,5,6,6,6,6,6,6,6,7,7,7,7,7,7,8,8,8,8,8,8,8,9,9,9,9,9,9,9,9,9,10,10,10,-10,-10,-10,-9,-8,-8,-8,-8,-8,-7,-7,-7,-7,-6,-6,-6,-6,-6,-6,-6,-5,-5,-5,-4,-4,-4,-4,-3,-3,-3,-3,-3,-3,-2,-2,-2,-2,-1,-1,0,0,0,1,1,1,1,1,1,2,2,2,2,2,2,2,2,3,3,3};
        System.out.println(searchNew(arr,2));
    }
    public static boolean search(int[] nums, int target) {
        int pivot =  find_pivot(nums);

        //Find in 0 to pivot
        int res = binary_search(nums, 0, pivot, target);
        if (res == -1){
            res = binary_search(nums, pivot+1, nums.length-1, target);
        }
        return res != -1 ? true : false;
    }

    static int binary_search(int[] nums, int s , int e, int target){

        while(s<=e){
            int m = (s+e)/2;

            if(target > nums[m])
                s = m+1;
            else if(target < nums[m])
                e = m-1;
            else
                return m;
        }

        return -1;
    }

    static int find_pivot(int[] nums){
        //Eg [4,5,6,7,0,1,2]
        int s = 0, e = (nums.length -1);

        if(nums.length == 1)
            return 0;

        while(s<=e){
            int m = (s+e)/2;

            if(m < nums.length-1 && nums[m]>nums[m+1])
                return m;
            else if(m > 0 && nums[m-1]>nums[m])
                return m-1;
            else if(nums[s]>nums[m]) //m is in the second part of array we need not search there thus pushing end to m-1
                e = m-1;
            else if(nums[s]<nums[m]) // m is in first part of array thus moving s to m+1
                s = m+1;
            else{
                if(nums[m] == nums[s])
                    e = m-1;
            }
        }


        s = 0; e = (nums.length -1);

        if(nums.length == 1)
            return 0;

        while(s<=e){
            int m = (s+e)/2;

            if(m < nums.length-1 && nums[m]>nums[m+1])
                return m;
            else if(m > 0 && nums[m-1]>nums[m])
                return m-1;
            else if(nums[s]>nums[m]) //m is in the second part of array we need not search there thus pushing end to m-1
                e = m-1;
            else if(nums[s]<nums[m]) // m is in first part of array thus moving s to m+1
                s = m+1;
            else{
                if(nums[m] == nums[s])
                    s = s+1;
            }
        }

        return -1;
    }

    public static boolean searchNew(int[] nums, int target) {

        int s= 0, e = nums.length-1;

        while(s<=e){
            int m = (s+e)/2;

            if(nums[m] == target || nums[s] == target || nums[e] == target)
                return true;

            else{
                if(nums[s] == nums[e]){
                    s++;
                    e--;
                    continue;
                }

                if(target > nums[m] && target< nums[s])
                    s = m+1;
                else if(target < nums[m] && target< nums[s]) {

                    if(nums[m]<=nums[m+1])
                        e = m-1;
                    else
                        s = m+1;


                }else if(target > nums[m] && target > nums[s] && nums[s] == nums[m]){
                    s = m+1;
                }else{
                    e = m-1;
                }
            }

        }

        return false;
    }


}
