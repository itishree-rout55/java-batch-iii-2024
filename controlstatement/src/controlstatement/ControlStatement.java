package controlstatement;

import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a number :");
		num = sc.nextInt();
		
	//  check the number is even or odd
		String result = num%2 == 0 ? "number is even":"number is odd";
		System.out.println(result);
		
	//A person is eligible for vote or not .
		System.out.println("Enter a age :");
		int age = sc.nextInt();
		String result1 = age>18 ? "Eligible for vote" : "Not eligible for vote";
		System.out.println(result1);
		
		
	}

}
