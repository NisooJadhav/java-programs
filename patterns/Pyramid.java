import java.util.*;

public class Pyramid{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("enter steps: ");
		int steps = s.nextInt();
		
		for(int i=1; i<=steps; i++){
			for(int j=1; j<=(2*steps-1); j++){
			    if(j>=steps-i+1 && j<=steps+i-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}  