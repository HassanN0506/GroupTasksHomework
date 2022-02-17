package groupTask;

public class Task2 {

	public static void main(String[] args) {
		
		//Create a 2D array of integer values. Print the sum of all numbers.
		
		int[][] numbers = {
				{1, 2, 3, 4, 5},
				{10, 20, 30, 40},
				{100, 200, 300},
				{0, 1000, 1}
		};
		
		int sum = 0;		
		
		for(int[] i:numbers) {
			
			for(int j:i) {
				
				sum += j;
			}
		}
		
		System.out.println(sum);
		
		
	}

}
