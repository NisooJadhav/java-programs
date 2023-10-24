import java.util.Scanner;

public class OddEven{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Odd-Even Checker");
        System.out.println("");
        System.out.println("enter no: ");
        int no = s.nextInt();

        if(no%2==0) System.out.println(no+" is even.");
        else System.out.println(no+" is odd.");
    }
}