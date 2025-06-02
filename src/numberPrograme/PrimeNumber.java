package numberPrograme;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter num : ");
		num = scan.nextInt();
		
		boolean isPrime = true;
		//check the number. 1 is can sub to all the num. so if input 1 then it is false
		if(num<=1) {
			isPrime = false;
		}
		else {
			//loop the given num from 2.
			for(int i=2; i<=num; i++) {
				if(num%i == 0) {
					isPrime = false;
				}
			}
		}
		if(isPrime) {
			System.out.println("Prime : "+num);
		}
		else {
			System.out.println("Not Prime: "+num);
		}
		scan.close();
	}

}
