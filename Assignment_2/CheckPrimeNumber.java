package OOPS_Part1.Assignment_2;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number: ");
		Scanner inputNumber = new Scanner(System.in);
		int number = inputNumber.nextInt();
				
		PrimeNumber(number);
		
		
	}
	
	public static void PrimeNumber(int number){
		boolean isPrime=true;

		for(int i=2; i<number; i++){
			if(number%i==0){
				isPrime=false;
				System.out.println(number + " is not a Prime Number");
				break;
			}								
		}
		if(isPrime)
		System.out.println(number + " is a prime number");
	}

}
