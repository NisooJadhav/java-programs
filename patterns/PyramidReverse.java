import java.util.Scanner;

public class PyramidReverse {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("REVERSE PYRAMID MAKER");
    System.out.println("");
    System.out.println("Enter Number of Steps:");
    int no = s.nextInt();

    for (int i = no; i >= 1; i--) {
      for (int a = 1; a <= no - i; a++) System.out.print(" ");
      for (int b = 1; b <= 2 * i - 1; b++) System.out.print("*");
      System.out.println();
    }
  }
}
