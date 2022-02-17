package groupTask;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		//Create an array of int values using a scanner and calculate the sum of all stored elements in that array.
		
		Scanner sc = new Scanner (System.in);
		
		int[] numbers = new int[5];
		
		System.out.println("Please enter "+numbers.length+" interger values");
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i]=sc.nextInt();
		}
		
		int sum =0;
		
		for(int j:numbers) {
			sum+=j;
		}
		
		System.out.println("The sum of all the numbers you entered is "+sum);
		
		sc.close();
		
		
	}

}
