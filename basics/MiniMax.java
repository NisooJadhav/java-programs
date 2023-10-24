import java.util.Scanner;

public class MiniMax{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // boolean first = true;

        while(true) {
            System.out.println("enter numbers: ");
            boolean isAnInt = s.hasNextInt();

            if(isAnInt){
                int no = s.nextInt();

                // if(first){
                //     first = false;
                //     min = no;
                //     max = no;
                // }

                if(no > max){
                    max = no;
                }

                if(no < min){
                    min = no;
                }
            } else break;
            s.nextLine();
        }
        System.out.println("min= " + min + ", max= " + max);
        s.close();
    }
}