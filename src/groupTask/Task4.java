package groupTask;

public class Task4 {

	public static void main(String[] args) {
		
		/*
		 * Create a 2D array of integers. 
		 * Develop a program which will calculate the sum of the even 
		 * and the sum of the odd numbers for that array.
		 */
		
		int[][] numbers = {
				{1, 2, 3, 4, 5},
				{11, 25, 30, 44},
				{103, 202, 309},
				{0, 1000}
		};
		
		int evenSum = 0;
		int oddSum = 0;
		
		for(int[] i:numbers) {
			
			for(int j:i) {
				
				if(j%2==0) {
					evenSum += j;
					
				} else if(j%2!=0) {
					oddSum += j;
				}
			}
		}
		
		System.out.println("The sum of all the even numbers is "+evenSum);
		System.out.println("The sum of all the odd numbers is "+oddSum);
		
		
	}

}
