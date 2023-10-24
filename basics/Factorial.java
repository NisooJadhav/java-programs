import java.util.Scanner;

public class Factorial{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter no: ");
        int no = s.nextInt();
        int mul = 1;
        for(int i=no; i>=1; i--)
            mul *= i;
        System.out.println("factorial of "+no+" is "+mul);
    }
}