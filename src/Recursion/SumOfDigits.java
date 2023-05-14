package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(fun_sumOfDigits(333, 0));
        System.out.println(fun_multiplocationOfALlDigits(505, 1));
    }

    static int fun_sumOfDigits(int n, int s){
        if(n == 0)
            return s;
        s = s + n%10;
        return fun_sumOfDigits(n/10, s);
    }

    static int fun_multiplocationOfALlDigits(int n, int m){
        if(n == 0)
            return m;
        m = m * (n%10);
        return fun_multiplocationOfALlDigits(n/10, m);
    }
}
