import java.util.*;

public class TestClass {

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> l = new ArrayList<Integer>();
        int m = (0+nums.length)/2;

        if(nums[m] == target){
            binarySearch(nums, 0, m-1, l, target,true);
            binarySearch(nums, m+1, nums.length, l, target,false);
        }

        Collections.sort(l);
        return l;
    }

    static List<Integer> binarySearch(int[] nums, int s, int e, List<Integer> l, int target, boolean flag){
        while(s<=e){
            int m = (s+e)/2;

            if(target>nums[m])
                s = m+1;
            else if(target<nums[m])
                e = m-1;
            else
                l.add(m);
            if(flag){
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return l;
    }

    public static void sort012(int a[], int n)
    {
        // code here
        int p = 0, q = 0, r = 0;

        for(int m : a){
            if(m == 0)
                p++;
            else if(m == 1)
                q++;
            else
                r++;
        }


        int i;
        for(i = 0; i<=p-1; i++){
            a[i] = 0;
        }

        int j;

        for(j = i; j<(i+q); j++){
            a[j] = 1;
        }

        for(int k = j; k<(j+r); k++){
            a[k] = 2;
        }

    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for(int i =0; i < n ; i++){
            while(nums[i]-1 != i){

                if(nums[i]<=0 || nums[i]>n || nums[nums[i]-1] == nums[i])
                    break;

                swap(nums[i]-1, i, nums);
            }
        }

        int count = 1;
        for(int i =0; i < n ; i++){

            if(nums[i]!=count)
                return count;

            count++;
        }

        return count;
    }

    public static void segregateElements(int arr[], int n)
    {
        // Your code goes here
        //By insertion sort
        // for(int i = n-1; i>=0;i--){

        //     for(int j=i; j<n ; j++){
        //         if(arr[j]<0){

        //             if(j+1 == n || arr[j+1]<0)
        //                 break;
        //             else
        //                 swap(j, j+1, arr);

        //         }
        //     }
        // }

        int[] a = new int[n];

        for(int i=0; i<n;i++){
            a[i] = arr[i];
        }
        int j=0;
        for(int i=0; i<n;i++){
            if(a[i]>=0){
                arr[j]=a[i];
                j++;
            }
        }

        for(int i=0; i<n;i++){
            if(a[i]<0){
                arr[j]=a[i];
                j++;
            }
        }
    }

    static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
//        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6 };
//        //sort012(arr, 5);
//        segregateElements(arr, 8);
//        System.out.println(Arrays.toString(arr));
        //replaceDigits("a1c1e1");
//        char c = 1;
//        System.out.println(Integer.valueOf('1'-'0'));
//        Integer.valueOf('c');
        System.out.println(reverseWords("i...like...this...program.very.much"));
        short x = 10;
        x = (short) (x*5);
        System.out.println(x);
    }

    public static String replaceDigits(String s) {
        char[] sa = s.toCharArray();
        int i = 1;
        while(i<sa.length){
            char res = (char)(sa[i-1] + Integer.parseInt(String.valueOf(sa[i])));
            sa[i] = res;
            i = i+2;
        }

        return String.valueOf(sa);
    }

    static String reverseWords(String S)
    {
        // your code here
        String[] s_arr = S.split("[.]+");

        for(int i = 0;i<s_arr.length;i++){
            s_arr[i] = reversedWord(s_arr[i]);
        }

        StringJoiner sj = new StringJoiner(".");
        for(String word:s_arr){
            sj.add(word);
        }

        return sj.toString();
    }

    static String reversedWord(String word){

        Stack<Character> wordStack = new Stack<>();

        for(char c:word.toCharArray()){
            wordStack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        while(!wordStack.empty()){
            sb.append(wordStack.pop());
        }
        return sb.toString();
    }
}
