package stringPrograms;

import java.util.Scanner;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		String input;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter input : ");
		
		input = scan.nextLine().toLowerCase();
		
		System.out.println("Below the Duplicate words");
		
		//count the total char in the word and store the word as char
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			int count = 0;
			
			//count the char again in the word
			for(int j=0; j<input.length(); j++) {
				//compare the already stored the character "ch" and input characters are same. if same then count 
				if(ch == input.charAt(j)) {
					count++;
				}	
			}
			//compare how many characters are same
			if(count>1 && input.indexOf(ch)==i) {
				System.out.println(ch +"="+ count);
			}	
		}
		scan.close();
	}

}
