import java.util.Scanner;
public class Capitalize {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        char[] arr = word.toCharArray();
        char c = Character.toUpperCase(arr[0]);
        System.out.print(c);
        for(int i=1;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
    }
}