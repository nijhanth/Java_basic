package basic1;

import java.util.Scanner;

public class HexagonArea {

	public static void main(String[] args) {
		/*double hex = 6;
		double len = 4;
		
		System.out.println("Enter hexagon length :");
		
		Scanner input = new Scanner(System.in);
		hex =input.nextDouble();
		System.out.println("Enter side length :");
		len =input.nextDouble();*/
		
		int s = 6;
		double area = (6 * (s  * s))/(4 * Math.tan(Math.PI / 6));
		
		System.out.println(area);

	}

}
