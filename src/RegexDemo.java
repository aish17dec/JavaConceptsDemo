import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String s = "aappqrstw";

//        boolean is_matches = Pattern.matches("[amn]?", "a"); //One of the a, m or n should come once or none times
//        System.out.println(is_matches);
//        is_matches = Pattern.matches("[apqrstq]?",s);
//        System.out.println(is_matches);


        String input = "Geeksforgeeks.org";
        String regex = "ge+";

        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(input);

        System.out.println("Total number of matched subsequence: "+m.groupCount());
        while(m.find()){
            System.out.println("Pattern found at "+m.start());
        }

        String data = "This is a test String and 'This is data we want'";
        Pattern pattern = Pattern.compile("'(\\D*\\s*)'");
        Matcher matcher = pattern.matcher(data);
        if (matcher.find())
        {
            System.out.println(matcher.group(1));
        }




    }
}


/*
*
*
* Pattern.matches("regex", "string"); -> Pattern resides in java.util.Regex package
* + -> one or more
* * -> zero or more
* ? -> once or none at all
* .-> Exactly one character
* x{n} -> Exactly n times
* x{n,} -> Exactly n times or more
* x{n,m} -> Exactly n times or more & less than m times.
* */