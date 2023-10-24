import java.util.Scanner;
public class LuckyNo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        String str = Integer.toString(no);
        char arr[] = str.toCharArray();
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            if((arr[i]=='4' || arr[i]=='7') || (no%4==0 || no%7==0) && no<=100){
                flag=true;
            }else {
                flag=false;
            }
        }
        System.out.println(flag?"YES":"NO");
    }
}