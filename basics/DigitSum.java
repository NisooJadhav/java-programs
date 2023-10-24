public class DigitSum{
    public static int DigitSum(int number){
        int sum=0;

        if(number<10) return -1;

        while(number>0){
            int digit = number % 10;
            sum += digit; // keep on adding last digit in sum
            number /= 10;  //drop last digit
        }
        return sum;
    }
    
    public static void main(String [] args){
        System.out.println(DigitSum(15));
    }
}