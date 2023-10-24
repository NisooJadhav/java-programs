import java.util.Scanner;

public class Pangram {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Pangram Verifier");
    System.out.println("");
    System.out.print("enter string: ");
    String str = s.nextLine();
    boolean flag = str
      .toLowerCase()
      .matches(
        "^(?=.*a)(?=.*b)(?=.*c)(?=.*d)(?=.*e)(?=.*f)(?=.*g)(?=.*h)(?=.*i)(?=.*j)(?=.*k)(?=.*l)(?=.*m)(?=.*n)(?=.*o)(?=.*p)(?=.*q)(?=.*r)(?=.*s)(?=.*t)(?=.*u)(?=.*v)(?=.*w)(?=.*x)(?=.*y)(?=.*z).*$"
      );
    System.out.println("");
    System.out.println(
      flag ? "your string is pangram" : "your string is not pangram"
    );
  }
}
