import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringDemo {

    public static void main(String[] args) {
        String s = "Hello";

        s = s+ " World"; //Internally uses StringBuilder/ Buffer // '+' is called String concatenation operator
        s = s.concat(" Have a nice Day!"); // Internally uses new keyword

        StringBuffer sb = new StringBuffer("Good");
        sb.append(" Morning");

        System.out.println(s);
        System.out.println(sb.substring(0,5));

        System.out.println(String.join(" ", s, sb));
        //There is a static method in Java 8+ String.join that accepts delimiter and array of elements to be joined separated by that delimiter


        StringJoiner sj = new StringJoiner(".");
        sj.add("test_string");
        sj.add("my_test");
        sj.add("my_test2");

        System.out.println(sj.toString()); //Result -> "atest_string  my_test  my_test2b"

        String s3 = new String("Aishwarya");
        String s4 = s3.intern();
        System.out.println(s4);
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println("-----------------------------------");
        stringTokenizerDemo();
    }

    public static void stringTokenizerDemo(){
        //refer https://www.geeksforgeeks.org/stringtokenizer-class-in-java/

        String s = "Hello : Geeks : How : are : you";
        StringTokenizer st = new StringTokenizer(s, " :", true);

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        String s1 = "2+3-1*8/4";
        StringTokenizer st2 = new StringTokenizer(s1, "+-*/", false);

        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
    }
}
