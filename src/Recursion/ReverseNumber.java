package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 000000;
        int i = (n+"").length();
        System.out.println((int)fun(n,i-1));
    }

    static double fun(int n, int i){
        if(n==0)
            return 0;
        return (n%10)*(Math.pow(10, i)) + fun(n/10, i-1);
    }
}
