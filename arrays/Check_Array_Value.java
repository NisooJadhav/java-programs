import java.util.Arrays;
import java.util.Scanner;

public class Check_Array_Value {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Integer nos[] = { 0, 1, 2, 3, 4, 5 };
    System.out.println("array is: " + Arrays.asList(nos));
    System.out.print("enter value to search: ");
    int no = s.nextInt();
    System.out.println(
      Arrays.asList(nos).contains(no) ? "value found" : "value not found"
    );
  }
}