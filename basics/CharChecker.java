import java.util.Scanner;

public class CharChecker{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter char: ");
        char c = s.next().charAt(0);
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        char alpha = Character.toLowerCase(c);
        if(alphabets.indexOf(alpha) != -1)
            System.out.println(c+" is alphabet");
        else if(numbers.indexOf(c) != -1)
            System.out.println(c+" is number");
        else
            System.out.println(c+" is symbol");
    }
}