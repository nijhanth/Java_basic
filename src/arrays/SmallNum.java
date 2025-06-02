package arrays;

public class SmallNum {

	public static void main(String[] args) {
		int[] num = {4, 8, 9, 34, 56, 1, 6};
		
		int small = num[0];
		
		for(int i=0; i<num.length; i++) {
			if(small>num[i]) {
				small = num[i];
			}
		}
		System.out.println(small);

	}

}
