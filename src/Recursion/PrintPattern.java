package Recursion;

public class PrintPattern {
    public static void main(String[] args) {
        printPattern2(1,1, 4);
    }

    static void printPattern1(int row, int col){
        if(row == 0)
            return;
        for(int i = 0; i<col;i++){
            System.out.print('*'+" ");
        }
        System.out.println();
        printPattern1(--row,--col);
    }

    static void printPattern2(int row, int col, int n){
        if(row == n+1)
            return;
        for(int i = 0; i<col;i++){
            System.out.print('*'+" ");
        }
        System.out.println();
        printPattern2(++row,++col,n);
    }
}
