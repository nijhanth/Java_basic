package basic1;

import java.util.Scanner;

public class ProductofTwoNumbers {

	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		
		System.out.println("Input first number");
		Scanner Input = new Scanner(System.in);
		firstNumber = Input.nextInt();
		
		System.out.println("Input second number");
		
		secondNumber = Input.nextInt();
		
		System.out.println("Input first number: " + firstNumber);
		System.out.println("Input second number: " + secondNumber);
		
		System.out.println(firstNumber + " x " + secondNumber + " = " + firstNumber*secondNumber);

	}

}
