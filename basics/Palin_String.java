import java.util.Scanner;

public class Palin_String {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("enter string: ");
    String str = s.nextLine();
    int start = 0;
    int end = str.length() - 1;
    boolean flag = false;
    if(str.length()==1){
      flag=true;
    }
    while (start < end) {
      if (str.charAt(start) != str.charAt(end)) {
        flag = false;
        break;
      }
      start++;
      end--;
      flag = true;
    }
    System.out.println(flag ? "string in palin":"string is not palin");
  }
}