import java.util.Scanner;

public class GetChar {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("enter string: ");
    String str = s.next();
    System.out.print("enter char index: ");
    int index = s.nextInt();
    System.out.println(
      "your char at index " + index + " is " + str.charAt(index)
    );
    System.out.println("");
  }
}