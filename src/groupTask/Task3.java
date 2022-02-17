package groupTask;

public class Task3 {

	public static void main(String[] args) {
		
		/*
		 * Create a 2D array of integer type where you will store odd and even numbers. 
		 * Develop a program which will identify/print the even numbers only.
		 */
		
		int[][] numbers = {
				{1, 2, 3, 4, 5},
				{11, 25, 30, 44},
				{103, 202, 309},
				{0, 1000, 12}
		};
		
		System.out.println("The even numbers in the array are: ");
		
		for(int[] i:numbers) {
			
			for(int j:i) {
				
				if(j%2==0) {
					System.out.println(j);
				}
			}
		}
		
		
	}

}
