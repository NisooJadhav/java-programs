import java.util.Arrays;

public class Array_Without_Sort {
  public static void main(String[] args) {
    Integer arr[] = { 20, 10, 50, 50, 30, 40, 60, 60, 60 };
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.print("array sorted without sort(): ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(+arr[i] + " ");
    }
  }
}
