public class ShuffleString {
    public static void main(String[] args) {
        int[] indices = {3,1,4,2,0};
        String s = "aiohn"; //nihao

        System.out.println(shuffle(s, indices));
    }

    static String shuffle(String s, int[] indices){
//        StringBuffer sb = new StringBuffer(s);
//
//        for(int i=0; i< s.length(); i++){
//            sb = replaceCharAt(s.charAt(i),indices[i], sb);
//        }
//
//        return sb.toString();
        char[] test = s.toCharArray();
        char[] temp = new char[test.length];

        for(int i = 0; i< s.length(); i++){
            temp[i] = '*';
        }


        for(int i = 0; i< s.length(); i++){
            temp[indices[i]] = test[i];
        }
        return new String(test);
    }

    static StringBuffer replaceCharAt(char target, int i, StringBuffer sb2){
        sb2 = new StringBuffer(sb2.substring(0, i)).append(target).append(sb2.substring(i+1));
        return sb2;
    }

    static void swap(int i, int j , char[] arr){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
