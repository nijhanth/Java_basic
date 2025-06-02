package basic1;

import java.util.Scanner;

public class CompareTwoNumbers {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		System.out.print("Enter num1 :");
		Scanner input = new Scanner(System.in);
		num1 = input.nextInt();
		
		System.out.print("Enter num2 :");
		num2 = input.nextInt();
		
		{
		if (num1 != num2) 
			System.out.println("Not matching");
		
		else 
			System.out.println("Matching");
		}
		{
			if (num1 < num2) 
				System.out.println("num2="+num2+ " is bigger than num1="+num1);
			
			else 
				System.out.println("num2="+num2+ " is smaller than num1="+num1);
			}
		{
			if (num1 <= num2) 
				System.out.println("num2="+num2+ " is equal to num1="+num1+" or bigger than num1="+num1);
			
			else 
				System.out.println("num2="+num2+ " is smaller than num1="+num1);
			}
		
	}

}
