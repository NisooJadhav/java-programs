import java.util.Arrays;
import java.util.Scanner;

public class Vowel_Consonant {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Vowel Consonant Checker");
    System.out.println("");
    System.out.println("enter character: ");
    char c = s.next().charAt(0);

    String vowels = "aeiouAEIOU";

    if (vowels.indexOf(c) != -1) {
      System.out.println("char " + c + " is a vowel");
    } else {
      System.out.println("char " + c + " is a consonant");
    }
  }
}