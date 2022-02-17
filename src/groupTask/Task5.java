package groupTask;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		//Write a program to swap 2 numbers without a temporary variable
		
		
		//FYI: We didn't learn this in class, I had to google it. it's easy though. 
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your 1st whole number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter your 2nd whole number");
		int num2 = sc.nextInt();
		
		num1 = num1*num2;
		
		num2 = num1/num2;
		
		num1= num1/num2;
		
		System.out.println("The 1st number is now "+num1+", and the 2nd number is now "+num2);
		
		sc.close();
		
		
	}

}
