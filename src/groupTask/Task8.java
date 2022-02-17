package groupTask;

public class Task8 {

	public static void main(String[] args) {
		
		//Maximum and minimum number in the array?
		
		int[][] numbers = {
				{1, 2, 3, 4, 5},
				{10, 20, 30, 40},
				{100, 200, 300},
				{0, 1000, -4}
		};
		
		int max= numbers[0][0];
		int min= numbers[0][0];
		
		for(int[] i:numbers) {
			
			for(int j:i) {
			
				if(j>max) {
					max=j;
				}
				
				if(min>j) {
					min=j;
				}
			}
		}
		
		System.out.println("The maximum number is "+max);
		System.out.println("The minimum number is "+min);
		
		
	}

}
