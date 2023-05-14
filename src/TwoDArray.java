public class TwoDArray {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        rotateby90(mat,3);
    }

    static void rotateby90(int matrix[][], int n)
    {
        // code here
        int clone_mat[][] = new int[n][n];

        for(int i = 0  ; i< n ; i++){
            for(int j = 0; j< n ; j++){
                clone_mat[i][j] = matrix[i][j];
                //System.out.print(clone_mat[j][k] + "  ");

            }
        }
        for(int i = 0, k =n-1  ; i< n ; i++, k--){
            for(int j = 0; j< n ; j++){
                matrix[i][j] = clone_mat[j][k];
                //System.out.print(clone_mat[j][k] + "  ");

            }
        }
    }
}
