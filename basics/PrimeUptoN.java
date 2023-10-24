    import java.util.Scanner;

    public class PrimeUptoN {
      public static boolean isPrime(int no) {
        if (no < 0)
          return false;
        for (int i = 2; i <= Math.sqrt(no); i++)
          if (no % i == 0)
            return false;
        return true;
      }

      public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number: ");
        int no = s.nextInt();
        System.out.println("prime numbers: ");
        for (int i = 1; i <= no; i++) {
          if (isPrime(i))
            System.out.println(i);
        }
      }
    }
