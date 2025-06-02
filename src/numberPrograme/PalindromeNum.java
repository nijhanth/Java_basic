package numberPrograme;

public class PalindromeNum {

	public static void main(String[] args) {
		int num = 56765;
		//String name = "user";
		String change = String.valueOf(num);
		String reverse = new StringBuilder(num).reverse().toString();
		System.out.println(reverse);
		System.out.println(change);
		
	if(reverse.equals(change)) {
		System.out.println("Palindrom");
	}
	else {
		System.out.println("Not");
	}
	}
	}



