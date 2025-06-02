package numberPrograme;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter : ");
		num = scan.nextInt();
		
		int a=0;
		int b=1;
		System.out.println(a+"\n"+b);
		for(int i=0; i<num; i++) {
			int c =a+b;
			System.out.println(c);
			a= b;
			b=c;
		}
		scan.close();
	}

}
