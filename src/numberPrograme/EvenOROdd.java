package numberPrograme;

import java.util.Scanner;

public class EvenOROdd {

	public static void main(String[] args) {
		int input;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value : ");
		input = scan.nextInt();

		if(input %2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		scan.close();
	}

}
