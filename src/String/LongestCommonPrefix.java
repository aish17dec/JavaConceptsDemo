package String;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)
            return strs[0];

        String baseString = strs[0];
        int lowestLength = 201;
        for(String s: strs){

            if(s.length() == 0)
                return "";

            if(s.length()<lowestLength){
                lowestLength = s.length();
                baseString = s;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int j = 0; j<= lowestLength; j++){
            //Taking each element and comparing its jth character with base string's jth character.
            if(chech_char_at_given_index(strs,j, baseString.charAt(j))){
                sb.append(baseString.charAt(j));
            }else{
                break;
            }
        }
        return sb.toString();
    }

    static boolean chech_char_at_given_index(String[] strs, int j, char c){
        for(int i = 0; i< strs.length; i++){
            if(!(strs[i].charAt(j) == c))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"ab", "a"});
    }
}
