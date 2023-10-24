import java.util.Scanner;

public class ReverseNumber{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter number: ");
        int no = s.nextInt();
        String str = Integer.toString(no);
        for(int i=str.length()-1; i>=0; i--)
            System.out.print(str.charAt(i));
    }
}