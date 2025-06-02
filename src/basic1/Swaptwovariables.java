package basic1;

import java.util.Scanner;

public class Swaptwovariables {

	public static void main(String[] args) {
		
		int a;
		int b;
		int temp;
		
		System.out.println("Enter a");
		Scanner input = new Scanner(System.in);
		a =input.nextInt();
		
		System.out.println("Enter b");
		b=input.nextInt();
		
		//temp taken a values. So a will be clear
		temp = a;
		
		//now a taken value from b. So b will be clear
		a = b;
		
		//now b taken value from temp. So temp will be clear
		b = temp;
		
		System.out.println("A value = "+a +"\n"+ "B value = "+b);
		
		input.close();
	}

}
