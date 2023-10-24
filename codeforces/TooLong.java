import java.util.*;
import java.io.*;
public class TooLong {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        s.nextLine();
        int i = 1;
        while(i<=4) {
            String str = r.readLine();
            char[] arr = str.toCharArray();
            if (str.length() > 10)
                System.out.println(arr[0] + "" + (str.length() - 2) + "" + arr[str.length() - 1]);
            else
                System.out.println(str);
            i++;
        }
    }
}