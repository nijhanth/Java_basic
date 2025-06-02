package numberPrograme;

public class AmstrongNum {

	public static void main(String[] args) {
		int num = 407;
        int a, b, c;

        a = num/100;
        b= (num/10)%10;
        c = num%10;
        
        int sum = (a*a*a)+(b*b*b)+(c*c*c);
        
        if(num == sum) {
        System.out.println("Prime");
        }
        else {
        	System.out.println("Not");
        }
	}

}
