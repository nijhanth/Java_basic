package arrays;

import java.util.Arrays;
import java.util.Collections;

public class DecendingOrder {

	public static void main(String[] args) {
		 Integer[] numbers = {5, 20, 15, 10, 30};

	        // Sort in Ascending Order
	        Arrays.sort(numbers);
	        System.out.println("Ascending Order: " + Arrays.toString(numbers));

	        // Sort in Descending Order
	        Arrays.sort(numbers, Collections.reverseOrder());;
	        System.out.println("Descending Order: " + Arrays.toString(numbers));

	}

}
