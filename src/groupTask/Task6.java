package groupTask;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		//Write a java program to check whether a given number is prime or not?
		
		
		//FYI: I had to google the formula for figuring out if a number is prime or not
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter a number");
		int num = sc.nextInt();
	
		boolean prime = true;
		
		for(int i=2; i < num ; i++) {
			
			if(num % i == 0) {
				
				prime = false;
				break;
			}
		}
			
		if(num<2) {
			prime=false;
		}
		
		
		if(prime) {
			System.out.println(num+" is a prime number");
			
		} else {
			System.out.println(num+" is not a prime number");
			
		}
		
		sc.close();
		
		
	}

}
