package Java8Features;

import java.util.Map;
import java.util.stream.Collectors;

public class InterviewQuesion {
    public static void main(String[] args) {
        String s = "Government of India";

        Map<Character,Long> hm = s.chars().mapToObj(c->
                (char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(hm);

    }
}
