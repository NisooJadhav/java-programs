import java.util.Scanner;

public class Simple_Interest {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Simple Interest Calculator");
    System.out.println("");
    System.out.print("enter principal amount: ");
    int p = s.nextInt();
    System.out.print("enter rate of interest: ");
    float i = s.nextFloat();
    System.out.print("enter time(years): ");
    int t = s.nextInt();

    System.out.println("");
    System.out.println("Simple Interest= ₹" + (p * i * t) / 100);
    System.out.println("Total Amount= ₹" + (p + (p * i * t) / 100));
    System.out.println("");
  }
}