import SortingAlgos.InsertionSort;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintAllDuplicatesInAString {

    public static void main(String[] args) {
        String s = "GeeksForGeeks";
        printAllDuplicatesUsingSorting(s);
    }

    public static void printAllDuplicatesUsingHashMap(String s){
        //Using HashMap

        //This Approach takes O(K) space complexity where K is the size of HashMap 0>K<s.length() because we have created a new hashmap to solve this problem
        //Time Complexity ->  O(NLogN + K) -> why? We are running a for loop upto the length of the string of size N and inside it we are putting values in
        // the hashmap. Putting value in hashmap takes logN time so N*LogN (For putting values)
        //Then we are traversing the whole size of Hashmap to find the keys whoze value is greater than 1 that takes K iterations

        int n = s.length();

        Map<Character, Integer> hm = new HashMap<>();

        for(int i=0; i< n; i++){
            if(!hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i), 1);
            else
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
        }

        Set<Character> hmKeys = hm.keySet();

        for(Character key: hmKeys){
            if(hm.get(key) > 1)
                System.out.println(key+ ", count = " +hm.get(key));
        }
    }

    static void printAllDuplicatesUsingSorting(String s){
        s = InsertionSort.insertionSort(s.toCharArray());
        char prev = s.charAt(0);
        int count = 1;
        for(int i=1; i< s.length(); i++){
            if(s.charAt(i) == prev){
                count++;
            }else{
                if(count>1)
                    System.out.println(prev+" times: "+count);
                count = 1;
                prev = s.charAt(i);
            }
        }

        if(count>1)
            System.out.println(prev+" times: "+count);
    }
}
