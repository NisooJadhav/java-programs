import java.util.Scanner;

public class Fibonacci{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter no: ");
        int no = s.nextInt();
        int i = 0;
        int j = 1;
        int sum = 0;
        System.out.println(" ");
        System.out.println(" series: ");
        for(int x=0; x<no; x++){
            sum = i+j;
            System.out.print(sum+" ");
            i=j;
            j=sum;
        }
    }
}