import java.util.Scanner;

public class Palin {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter a number: ");
    int n = s.nextInt();
    String no = Integer.toString(n);

    int start = 0;
    int end = no.length() - 1;
    boolean isPalin = false;

    while (start < end) {
      if (no.charAt(start) != no.charAt(end)) {
        isPalin = false;
        break;
      }
      start++;
      end--;
      isPalin = true;
    }

    if (isPalin) {
      System.out.println("number is palin");
    } else {
      System.out.println("number is not palin");
    }
  }
}