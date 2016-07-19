package OOPS_Part1.Assignment_1;

import java.util.Scanner;
import java.lang.Math;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		
		System.out.println("Square Root is " + Math.sqrt(a));
		System.out.println("Cube Root is" + Math.cbrt(a));
		
	}
	
//	public static double sqrt(int givenNumber){
//		
//	}
//	
//	public static double cbrt(int givenNumber){
//		
//	}

}
