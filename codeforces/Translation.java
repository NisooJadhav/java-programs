import java.util.Scanner;
public class Translation {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine(), rev2="";
        String rev = s.nextLine();
        for(int i=0; i<str.length(); i++) {
            rev2 = str.charAt(i) + rev2;
        }
        System.out.print(rev.equals(rev2)?"YES":"NO");
    }
}