package OOPS_Part1.Assignment_4;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To get the 1st value
		System.out.println("Enter the 1st value");
		Scanner inputValue1 = new Scanner(System.in);
		int a = inputValue1.nextInt();
		
		// To get the 2nd Value
		System.out.println("Enter the 2nd value");
		Scanner inputValue2 = new Scanner(System.in);
		int b = inputValue2.nextInt();
		
		// Asking User which operation to perform?
		System.out.println("Enter any one of the Operator to perfrom");
		System.out.println("If Addition, please enetr '1'");
		System.out.println("If Subtraction, please enter '2'");
		System.out.println("If Division, please enter '3'");
		System.out.println("If Multiplication, please enter '4'");
		Scanner inputOperation = new Scanner(System.in);
		int Operation = inputOperation.nextInt();
				
		Addition add = new Addition();
		Subtraction minus = new Subtraction();
		Division div = new Division();
		Multiplication multi = new Multiplication();
		
		if(Operation == 1 ){
			Addition.perfromAdd(a, b);
		}else if(Operation == 2){
			Subtraction.perfromSubtraction(a, b);

		}else if (Operation == 3){
			Division.perfromDivision(a, b);
		}else if (Operation == 4){
			Multiplication.perfromMultiplication(a, b);
		}else{
			//do nothing
		}
		 
		
	}

}
