public class CellWithOddValuesInMatrix {

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] a = new int[m][n];

        for(int i = 0; i< indices.length; i++){
            for(int j = 0; j< indices[i].length; j++){
                if(j%2 == 0)
                    increment_row(a, indices[i][j]);
                else
                    increment_column(a, indices[i][j]);
            }
        }

        int count = 0;

        for(int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){
                if(!(a[i][j]%2==0))
                    count++;
            }
        }

        return count;
    }

    static void increment_row(int[][]a, int r){
        for(int j = 0; j<a[r].length;j++){
            a[r][j]++;
        }
    }

    static void increment_column(int[][]a, int c){
        for(int j = 0; j<a.length;j++){
            a[j][c]++;
        }
    }

    public static void main(String[] args) {
        int[][] indices = {
                            {0,1},
                            {1,1}
                            };

        System.out.println(oddCells(2,3,indices));


    }
}


