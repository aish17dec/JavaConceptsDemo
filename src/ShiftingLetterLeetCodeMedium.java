public class ShiftingLetterLeetCodeMedium {
    public static String shiftingLetters(String s, int[] shifts) {

        char[] sa = s.toCharArray();

        for(int i = 0; i< shifts.length; i++){
            if(shifts[i]>26){
                shifts[i] = shifts[i]-((shifts[i]/26)*26);
            }
        }

        int sum = 0;
        for(int i:shifts){
            sum = sum + i;
        }

        int temp = shifts[0];
        shifts[0] = sum;

        for(int i = 1; i< shifts.length; i++){
            int k = shifts[i];
            shifts[i] = sum - temp;
            temp = temp + k;
        }

        for(int i = 0; i< shifts.length; i++){
            if(shifts[i]>26){
                shifts[i] = shifts[i]-((shifts[i]/26)*26);
            }
        }


        for(int i = 0; i< shifts.length; i++){
            if(shifts[i]>0){

                int shft = shifts[i];
                if(sa[i] == 'z'){
                    sa[i] = 'a';
                    shft--;
                }
                if(sa[i]+shft > 'z'){
                    int diff = (sa[i]+shft)-'z';
                    sa[i] = (char)('a' + (diff-1));
                }else{
                    sa[i] = (char)(sa[i] + shft);
                }

            }
        }

        return String.valueOf(sa);

    }

    public static void main(String[] args) {
        int[] shifts = {26,9,17};
        String red = shiftingLetters("ruu", shifts);
        System.out.println(red);
    }
}
