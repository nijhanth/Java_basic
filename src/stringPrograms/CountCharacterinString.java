package stringPrograms;

public class CountCharacterinString {

	public static void main(String[] args) {
		
		String value = "  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		
		count(value);
	
	// Call the count method to analyze the characters in the test string
		count(value);
	}

	private static void count(String x) {
		// Convert the input string to a character array
		char [] ch = x.toCharArray();
		
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		
		for (int i=0; i<x.length(); i++) {
			if(Character.isLetter(ch[i])) {;
			letter++;}
			else if (Character.isSpaceChar(ch[i])) {
			space++;}
			else if (Character.isDigit(ch[i])) {
				num++;}
			else {
				other++;
			}
			
		}
		// Display the original string
        System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        
        // Display the counts of letters, spaces, numbers, and other characters
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
		
	}
	
	
	}
	
