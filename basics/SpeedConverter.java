// 1 mile/h = 1.609 km/h

public class SpeedConverter{    
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0)
            return -1;
        return Math.round(kilometersPerHour/1.609);
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0)
            System.out.println("Invalid Value");

        long calc = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/hr = " + calc + " mi/hr");
    }    
}

