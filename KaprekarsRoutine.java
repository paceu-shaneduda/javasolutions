import java.util.*;
public class KaprekarsRoutine {

	//Write a function that, given a 4-digit number, 
	//returns the largest digit in that number. 
	//Numbers between 0 and 999 are counted as 4-digit numbers with leading 0's.
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int  testNum = rand.nextInt(9999) + 1;
		System.out.println("your test number is "+ testNum);
		System.out.println();
		System.out.println("Your test numbers biggest digit is" + " "+largest_digit(testNum));
		

	}
	
	public static int largest_digit(int x){
		
		String y = Integer.toString(x);
		int firstNum = Character.digit(y.charAt(0), 10);
		int biggestNum = firstNum;
		
		if(y.charAt(0) == 9){
			return 9;
		}
		
		else{
						
			for(int i = 0; i < y.length()-1; i++){	
				
				if(y.charAt(i+1) > y.charAt(i)){			
					
					biggestNum = Character.digit(y.charAt(i+1), 10);				
				}		
			}
		}
		return biggestNum;
	}

}
