import java.util.Scanner;

public class SumOfDigits{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter no: ");
        int no = s.nextInt();
        String str = Integer.toString(no);
        int sum=0;
        for(int i=0;i<str.length();i++)
            sum += Character.digit(str.charAt(i), 10);
        System.out.println(sum);
    }
}
