package basic1;

public class AmericanFlagDisplay {

	public static void main(String[] args) {
		
		String line1 = "* * * * * * ====================\n * * * * *  ====================";
		String line2 = "* * * * * * ====================";
		String line3 = "================================";
		for (int i=0; i<4 ; i++) {
			
			//first 8 line in the flag
			System.out.println(line1);
								    
			}
			// 9th line of the flag
		    System.out.println(line2);
		    					
		 for (int i=0; i<6; i++) {
			 System.out.println(line3);
		 }
	}

}
