package basic1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter input a number");
		Scanner Input = new Scanner(System.in);
		num = Input.nextInt();
		
		for(int i = 0 ; i<10 ; i++ ) {
			System.out.println(num+" x "+(i+1)+" = "+(num*(1+i)));
		}
		

	}

}
