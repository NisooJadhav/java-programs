import java.util.Scanner;

public class CountOfDigit{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("enter number: ");
        int no = s.nextInt();
        String str = Integer.toString(no);
        int count = 0;
        for(int i=0;i<str.length();i++)
            count++;
        System.out.println(count);
    }
}