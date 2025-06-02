package stringPrograms;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		String name;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = input.nextLine();
		System.out.println(name);
		
		String reverse = "";
		
		for(int i=name.length()-1; i>=0; i--) {
			reverse+=name.charAt(i);
		}
		System.out.println(reverse);
		
		if(name.equals(reverse)){
			System.out.println("palindrom");
		}
		else {
			System.out.println("Not");
		}
		input.close();
	}

}
