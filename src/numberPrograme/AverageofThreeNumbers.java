package numberPrograme;

import java.util.Scanner;

public class AverageofThreeNumbers {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		System.out.println("Enter a");
		
		Scanner input = new Scanner(System.in);
		
		a = input.nextInt();
		
		System.out.println("Enter b");
		
		b = input.nextInt();
		
		System.out.println("Enter c");
		
		c= input.nextInt();
		
		System.out.println((a+b+c)/3);
		
		input.close();
	}

}
