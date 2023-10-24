import java.util.Arrays;

public class Array_Sort_Desc {
  public static void main(String[] args) {
    Integer arr[] = { 20, 10, 50, 50, 30, 40, 60, 60, 60 };
    Arrays.sort(arr);
    System.out.print("descending sorted array: ");
    for(int i=arr.length-1; i>=0; i--){
        System.out.print(arr[i]+" ");
    }
  }
}