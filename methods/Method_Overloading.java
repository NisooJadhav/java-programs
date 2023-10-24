// 1 inch = 2.54cm, 1 foot = 12 inches

public class Method_Overloading{
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double centimeters = (feet*12) * 2.54 + inches * 2.54;
        if(feet>=0 && inches>=0 && inches<=12)
            System.out.println(Math.round(feet)+" feet "+Math.round(inches)+" inches = "+centimeters+" centimeters");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;

        double centimeters = inches * 2.54;
        if(inches>=0)
            System.out.println(Math.round(feet)+" feet "+Math.round(remainingInches)+" inches = "+centimeters+" centimeters");
        return -1;
    }

    public static void main(String [] args){
        calcFeetAndInchesToCentimeters(12,12);
        calcFeetAndInchesToCentimeters(156);
    }
}