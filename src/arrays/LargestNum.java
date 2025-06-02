package arrays;

public class LargestNum {

	public static void main(String[] args) {
		int[] num = {4, 8, 9, 34, 56, 1, 6};
		
		int large = num [0];
		
		for(int i=0; i<num.length; i++) {
			if(large<num[i]) {
				large = num[i];
			}
		}
		System.out.println(large);

	}

}
