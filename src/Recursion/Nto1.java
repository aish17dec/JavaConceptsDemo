package Recursion;

public class Nto1 {
    public static void main(String[] args) {
        printnums(10);
    }

    static void printnums(int n){
        if(n == 0){
            return;
        }
        printnums(n-1);
        System.out.println(n);
    }
}
