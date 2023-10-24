import java.util.Arrays;

public class Array_Sort {
  public static void main(String[] args) {
    Integer arr[] = { 20, 10, 50, 50, 30, 40, 60, 60, 60 };
    Arrays.sort(arr);
    System.out.print("array sorted with sort(): " + Arrays.asList(arr));
  }
}
