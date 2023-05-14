package Recursion;

public class FilterString {
    //remove all 'a' from string using recursion
    public static void main(String[] args) {
        String s = "eemckxmckx";
        String part = "emckx";
        //String res = ""; //filter_String(new StringBuilder(s), 0,part).toString();
//        if(!s.contains(part))
//            return s;
//
//        if(s.length() == part.length() && s.equals(part)){
//            return "";
//        }
        int i = 0;
        StringBuilder sb = null;
        while(!(s.length() <= part.length() || !s.toString().contains(part))){
            if(s.substring(i).startsWith(part)){
                sb = new StringBuilder();
                if(i+part.length()<s.length()){
                    sb = sb.append(s.substring(0,i)).append(s.substring(i+part.length()));
                }else{
                    sb = sb.append(s.substring(0,i));
                }
                s = sb.toString();
                i=0;
            }else{
                i++;
            }
        }

        sb = sb.equals(part)? new StringBuilder() :sb;

        System.out.println(sb.toString());
    }

    static StringBuilder filter_character(String s, int i){

        StringBuilder sb = new StringBuilder();
        if(i == s.length())
            return new StringBuilder();

        if(s.charAt(i)!='a')
            sb.append(s.charAt(i));

        return sb.append(filter_character(s,i+1));
    }

    static StringBuilder filter_String(StringBuilder s, int i, String part){
        if(s.length() <= part.length() || !s.toString().contains(part))
            return s;

        if(s.substring(i).startsWith(part)){
            StringBuilder sb = new StringBuilder();
           if(i+part.length()<s.length()){
               sb = sb.append(s.substring(0,i)).append(s.substring(i+part.length()));
           }else{
               sb = sb.append(s.substring(0,i));
           }
           s = sb;
           i=-1;
        }
        return filter_String(s,i+1,part);
    }
}
