public class delete_max_number_in_each_row {
    public static int deleteGreatestValue(int[][] grid) {
        int max = 0;
        int[] deleted_nums = new int[grid.length];
        int result = 0, r= 0;

        while(r<grid[0].length){
            int k = 0;

            for(int i = 0 ; i< grid.length ; i++){
                int p = 0, q = 0;
                for(int j = 0; j< grid[i].length; j++){
                    if(grid[i][j] > max){
                        max = grid[i][j];
                        p = i;
                        q = j;
                    }
                }

                deleted_nums[k] = max;
                grid[p][q] = 0;
                k++;
                max = 0;
            }

            result = result + max_val(deleted_nums);
            r++;
        }
        return result;
    }

    static int max_val(int[] arr){
        int max = arr[0];

        for(int n : arr){
            if(n>max)
                max = n;
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,4},{3,3,1}};
        System.out.println(deleteGreatestValue(arr));
    }
}