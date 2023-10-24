import java.util.*;

public class Simple{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("enter steps: ");
		int steps = s.nextInt();
		
		for(int i=1; i<=steps; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");	
			}
			System.out.println();
		}
	}
}