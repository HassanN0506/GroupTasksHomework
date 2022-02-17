package groupTask;

public class Task9 {

	public static void main(String[] args) {
		
		//Write a java program to find the second largest number in the array?
		
		int[][] numbers = {
				{1, 2, 3, 4},
				{10, 20, 30, 40},
				{99, 100, 110}
		};
		
		int largest= numbers[0][0];
		int secondLargest= numbers[0][0];
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				
				if(numbers[i][j]>largest) {
					
					int placeHolder=largest;
					
					largest=numbers[i][j];
					
					secondLargest=placeHolder;
				}
				
				int lastElement = numbers[i][(numbers[i].length)-1];
				
				if(lastElement>secondLargest && lastElement<largest) {
					secondLargest=lastElement;
				}
			}
		}
		
		System.out.println("The second largest number is "+secondLargest);
		
		
	}

}
