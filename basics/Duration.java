public class Duration {

    private static final String INVALID_VALUE_MESSAGE = "invalid value"; //constant

    private static String getDurationString(long minutes, long seconds){
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        
        if(minutes>=0 && seconds>=0 && seconds<=59)
            return hours + "h " + remainingMinutes + "m " + seconds + "s";
        
        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(long seconds){
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        if(seconds>=0)
            return getDurationString(minutes, remainingSeconds);
        return INVALID_VALUE_MESSAGE;
    }

    public static void main(String [] args){
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));
    }
}