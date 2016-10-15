import java.util.*;
public class KaprekarsRoutine {

	//Write a function that, given a 4-digit number, 
	//returns the largest digit in that number. 
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int  testNum = rand.nextInt(9999) + 1;
		System.out.println("your test number is "+ testNum);
		System.out.println();
		System.out.println("Your test numbers biggest digit is" + " "+largest_digit(testNum));
		

	}
	
	public static int largest_digit(int x){
		
		String y = Integer.toString(x); //need to be able to search the 4 digit int, turning it into a string allows us to toChar spotcheck it
		int biggestNum = Character.digit(y.charAt(0), 10); 
		
		if(biggestNum == 9){
			return 9; //if the first digit is a 9, then we know that there cant be anything bigger than that, return 9
		}
		
		else{
						
			for(int i = 0; i < y.length()-1; i++){ //runs 4 times, constant runtime
				
				if(Character.digit(y.charAt(i+1), 10) > biggestNum){ //since comparing chars compares their unicode value, comparing single digits as a part of a string works in this instance			
					
					biggestNum = Character.digit(y.charAt(i+1), 10);	//if the next int is bigger than the current int, the next int becomes king of the hill			
				}		
			}
		}
		return biggestNum;
	}

}
