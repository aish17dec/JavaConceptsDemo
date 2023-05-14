public class SortSentence {

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s) {
        String[] temp  = s.split(" ");

        bubbleSort(temp);
        String new_s = "";

        for(String word: temp){
            new_s = new_s + " ";
        }

        return new_s;
    }

    static void swap(int i, int j, String[] s){
        String temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    static void bubbleSort(String[] arr){
        int n = arr.length;
        boolean is_swapped;

        for(int i = 0; i<arr.length-1; i++){
            is_swapped = false;
            for(int j = 0; j< n-i-1 ; j++){
                if( arr[j].charAt(arr[j].length()-1) > arr[j+1].charAt(arr[j+1].length()-1) ){
                    swap(j+1,j,arr);
                    is_swapped = true;
                }
            }

            if(!is_swapped)
                break;
        }
    }
}
