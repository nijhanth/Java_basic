package stringPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseName {

	public static void main(String[] args) {
	
		        String input = "test user";
		        String output = "";
		        
		        List<String> word = Arrays.asList(input.split(" "));
		        Collections.reverse(word);
		        output += String.join(" ", word);
		        
		        System.out.println(output);
		      System.out.println("*************************************");  
		        String input1 = "SDS";
		        String output2 = "";
		        
		        for(int i=input1.length()-1; i>=0; i--) {
		        	output2+=input1.charAt(i);
		        }
		        System.out.println(output2);
		        
		        if(input1.equals(output2)) {
		        	System.out.println("Palin");
		        }
		        else{
		        	System.out.println("Not");
		        }
		        
		    }

	}

