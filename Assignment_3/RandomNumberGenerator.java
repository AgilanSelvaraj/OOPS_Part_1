package OOPS_Part1.Assignment_3;

import java.util.Scanner;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enetr a number");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		float RD=RandomGenerator(number);
		System.out.println(RD);

	}
	
	public static float RandomGenerator(int givenValue){
		int a,b,c;
		float d;
		a= givenValue*3;
		b= 1+a;
		c= a*b;
		d= c/3;
		return d;
		
	}

}
