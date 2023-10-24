import java.util.Scanner;

public class Armstrong{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter no: ");
        int no = s.nextInt();
        String str = Integer.toString(no);
        char arr[] = str.toCharArray();
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            int digit = Character.getNumericValue(arr[i]);
            sum += Math.pow(digit, 3);
        }
        if(sum==no)System.out.println(no+" is armstrong");
        else System.out.println(no+" is not armstrong");
    }
}