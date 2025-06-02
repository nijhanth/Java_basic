package basic1;

public class FacePrinter {

	public static void main(String[] args) {
		
		//for each loop mode
		String face[] = {" +\"\"\"\"\"+ " , "[| o o |]", " |  ^  |", " | '-' | ", " +-----+"};
		
		for(String print : face) {
			System.out.println(print);
		}
		
		//for loop mode
		 // Create an array to store lines of an ASCII art representation
		  String[] arra = new String[5];

		  // Populate the array with lines to form an ASCII art representation of a simple face
		  arra[0] = " +\"\"\"\"\"+ ";
		  arra[1] = "[| o o |]";
		  arra[2] = " |  ^  |";
		  arra[3] = " | '-' |";
		  arra[4] = " +-----+";

		// Use a loop to print each line of the ASCII art representation
		  for (int i = 0; i < 5; i++) {
		   System.out.println(arra[i]);
		  }
	
	
	}

}
