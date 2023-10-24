import java.util.Arrays;

public class Rem_Dup_Sort {
  public static void main(String[] args) {
    Integer arr[] = { 20, 10, 50, 50, 30, 40, 60, 60, 60 };
    Arrays.sort(arr);
    int c = 1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[i - 1]) {
        arr[c] = arr[i];
        c++;
      }
    }
    arr = Arrays.copyOf(arr, c);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
