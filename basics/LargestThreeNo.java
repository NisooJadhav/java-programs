import java.util.Scanner;

public class LargestThreeNo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter 3 numbers: ");
    int no1 = s.nextInt();
    s.nextLine();
    int no2 = s.nextInt();
    s.nextLine();
    int no3 = s.nextInt();

    if (no1 > no2 && no1 > no3) {
      System.out.println(no1 + " is the largest number.");
    } else if (no2 > no1 && no2 > no3) {
      System.out.println(no2 + " is the largest number.");
    } else if (no1 == no2 && no2 == no3) {
      System.out.println("All numbers are equal.");
    } else {
      System.out.println(no3 + " is the largest number.");
    }
  }
}