import java.util.*;
public class ReverseFactorial {

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System. in);
		System.out.println("Enter a number to check its factorial");
		
		int testNum = scanner.nextInt();
		System.out.println(testNum + " = " + reverseFact(testNum)+ "!" );
		
		
		
	}
	
	/*need to figure out 'edge' cases where the testNum does'nt equal a clean factorial (5040, 720, etc)
	Any quick way to quickly check to see if the inputted number is good?*/
	public static int reverseFact(int x){
		
		int i=1;
		
		while(x > 1){
			
			i++;
			x=x/i;	
			
		}
		return i;	
	}
}
