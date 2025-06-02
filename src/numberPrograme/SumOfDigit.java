package numberPrograme;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter : ");
		num = scan.nextInt();
		
		int sum = 0;
		
		while(num != 0) {
			sum += num%10;
			num/=10;
		}
		System.out.println(sum);
		scan.close();
	}

}
