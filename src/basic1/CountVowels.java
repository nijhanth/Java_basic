package basic1;

import java.util.Scanner;

public class CountVowels {

public static void main(String[]arg) {
	String value;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter value :");
	
	value = input.nextLine();
	
	System.out.println(value);
	
	int vowel = 0;
	int other = 0;
	
	for(int i=0; i<value.length(); i++) {
		char ch = value.charAt(i);
		
	if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u') {
		vowel++;
	}
	else {
		other++;
	}
		
	}
	System.out.println("Vowel :" +vowel);
	System.out.println("other :"+ other);
	
	input.close();
	
}
}
