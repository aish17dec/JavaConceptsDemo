public class MinimumTimeGC {
    public static void main(String[] args) {
        String[] garbage = {"G", "P", "GP", "GG"};
        int[] travel = {2, 4, 3};

        System.out.println(garbageCollection(garbage, travel));
        System.out.println( new int[]{1,1});

    }
    /*public static int garbageCollection(String[] garbage, int[] travel) {
        char[] v = {'M','G','P'};
        int time = 0;

        for(int i = 0; i< v.length; i++){
            //checking each house
            for(int j = 0; j< garbage.length; j++){
                int c = count_type_of_units(v[i], garbage[j]);
                time = time + c;
                if(j<garbage.length-1 && !(c == 0 && ))
                    time = time + travel[j];
            }
        }
        return time;

    }*/

    static int count_type_of_units(char v, String garbage) {
        int time = 0;
        for (char g : garbage.toCharArray()) {
            if (g == v)
                time++;
        }
        return time;
    }

    public static int garbageCollection(String[] garbage, int[] travel) {
        char[] v = {'M', 'G', 'P'};
        int time = 0 ; int tc = 0;
        for (int i = 0; i < v.length; i++) {
            //checking each house
            int j ; tc = 0;
            for (j = 0; j < garbage.length; j++) {
                if(!is_any_more_garbage_left(garbage, v[i], j))
                    break;

                tc = tc + count_type_of_units(v[i], garbage[j]);

                if(!is_any_more_garbage_left(garbage, v[i], j+1))
                    break;
            }

            if(tc>0)
                time = time + tc + calculate_travel_time(travel, j-1);
        }
        return time;
    }

    static int calculate_travel_time(int[] travel, int index){
        int sum = 0;
        for(int i= 0; i<=index; i++){
            if(i == travel.length)
                break;
            sum+= travel[i];
        }
        return sum;
    }

    static boolean is_any_more_garbage_left(String[] garbage, char v, int i){
        for(int j = i; j< garbage.length; j++){
            if(garbage[j].contains(v+""))
                return true;
        }
        return false;
    }
}