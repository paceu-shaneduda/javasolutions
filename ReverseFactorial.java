import java.util.*;
public class ReverseFactorial {

	public static void main(String[] args) {
		
    //Generates random numbers for to test
		Random rand = new Random();
		int  testNum1 = rand.nextInt(9999) + 1;
		int  testNum2 = rand.nextInt(9999) + 1;
		int  testNum3 = rand.nextInt(9999) + 1;
		
		/*System.out.println("Test number is "+ testNum1);
		System.out.println(testNum1 + " = " + reverseFact(testNum1)+ "!" );
		
		System.out.println("Test number is "+ testNum2);
		System.out.println(testNum2 + " = " + reverseFact(testNum2)+ "!" );
		
		System.out.println("Test number is "+ testNum3);
		System.out.println(testNum3 + " = " + reverseFact(testNum3)+ "!" );*/
		
    //Set test case
		System.out.println("Test number is 720");
		System.out.println("720 equals " + reverseFact(720)+"!");
		
		
	}
	
	public static int reverseFact(int x){
		
		int i=1;
				
		while(x > 1){
			
			i++;
			x=x/i;
			
		}
		
		return i;
		
	}

}
