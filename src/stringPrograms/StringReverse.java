package stringPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class StringReverse {

	public static void main(String[] args) {

		String s= "Welcome to my java test project 123";
		 count(s);
		
		
//		String output = StringReverse(s);
//			    System.out.println(output);

		String input= "Welcome to my java test project";
		String output = StringReverse(input);
			    System.out.println(output);

		
}
	private static void count(String s) {
		
		char [] ch = s.toCharArray();
		
		int letter=0;
		int other=0;
		int number=0;
		
		for (int i=0; i<s.length(); i++) {
			if(Character.isLetter(ch[i])) {;
			letter++;}
			else if(Character.isDigit(ch[i]))
			number++;
			else {
				other++;
			}
		}
		System.out.println(letter);
		System.out.println(other);
		System.out.println(number);
	}

	public static String StringReverse(String input) {
		List<String> words = Arrays.asList(input.split(" "));
	    Collections.reverse(words);
		return String.join(" ", words);

//	public static String StringReverse(String s) {
//		List<String> words = Arrays.asList(s.split(" "));
//	    Collections.reverse(words);
//		return String.join(" ", words);
	}

}

