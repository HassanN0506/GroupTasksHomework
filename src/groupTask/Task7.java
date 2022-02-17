package groupTask;

public class Task7 {

	public static void main(String[] args) {
		
		//Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		
		//FYI: I had to google what Fibonacci series is.
		
		int firstNum=0;
		int secondNum=1;
		System.out.print(firstNum+" "+secondNum+" ");
		
		for(int i=2; i<10; i++) {
			
			int thirdNum = firstNum+secondNum;
			
			System.out.print(thirdNum +" ");
			
			firstNum=secondNum;
			
			secondNum=thirdNum;
		}
		
		
	}

}
