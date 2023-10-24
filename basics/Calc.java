import java.util.Scanner;

public class Calc{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Calculator");
        System.out.print("enter first no: ");
        int no1 = s.nextInt();
        System.out.print("enter operation: ");
        char opr = s.next().charAt(0);
        System.out.print("enter second no: ");
        int no2 = s.nextInt();
        int ans;
        switch(opr){
            case '+':
                System.out.println(no1+" + "+no2+" = "+(no1+no2));
                break;
            case '-':
                System.out.println(no1+" - "+no2+" = "+(no1-no2));
                break;
            case '*':
                System.out.println(no1+" * "+no2+" = "+(no1*no2));
                break;
            case '/':
                System.out.println(no1+" / "+no2+" = "+(no1/no2));
                break;
            case '%':
                System.out.println(no1+" % "+no2+" = "+(no1%no2));
                break;
            default:
                System.out.println("enter proper operation");
                return;
        }
    }
}