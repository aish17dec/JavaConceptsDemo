package Recursion;

public class CountNoOfZeros {
    public static void main(String[] args) {
        System.out.println(fun(1020304050,0));
    }

    static int fun(int n, int c){
        if(n == 0)
            return c;
        if(n%10 == 0)
            c++;
        return fun(n/10, c);
    }
}
