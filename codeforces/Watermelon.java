import java.util.Scanner;
public class Watermelon{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int kilo = s.nextInt();
        if(kilo>2 && kilo%2==0)System.out.print("YES");
        else System.out.print("NO");
    }
}