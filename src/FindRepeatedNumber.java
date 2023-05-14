import java.util.Arrays;

public class FindRepeatedNumber {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        // for(int i = 0; i < nums.length ; i++){
        //     for(int j = i+1; j< nums.length ; j++){
        //         if(nums[i] == nums[j])
        //             return nums[i];
        //     }
        // }
        // return -1;

        int[] nums2 = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums2);
        for(int i = 0; i < nums2.length-1 ; i++){
            if(is_duplicate(nums2, nums2[i],i+1)){
                return nums2[i];
            }
        }
        return -1;
    }

    static boolean is_duplicate(int[] nums2, int n, int s){
        int e = nums2.length-1;

        while(s<=e){
            int m = s+ (e-s)/2;

            if(n > nums2[m])
                s = m+1;
            else if(n < nums2[m])
                e = m-1;
            else
                return true;
        }
        return false;
    }
}

