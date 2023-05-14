package BasicsOfJava;

public class EnumDemo {
    public static void main(String[] args) {
        WeekDay today = WeekDay.MONDAY;
        System.out.println(today);
        System.out.println(getMood(today));

        for(WeekDay day: WeekDay.values()){
            System.out.println(day.ordinal());
        }
    }

    public static String getMood(WeekDay day){
        String mood = "";
        switch (day){
            case MONDAY:
            case TUESDAY:mood = "irritated";
                            break;
            case WEDNESDAY:mood ="Okay";
                            break;
            case THURSDAY:mood = "Cool";
                            break;
            case FRIDAY:mood = "very happy";
                break;
            case SATURDAY:
            case SUNDAY:mood = "sleepy";
                break;
            default:
                mood = "moderate";
                break;
        }

        return mood;
    }
}

enum WeekDay{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
